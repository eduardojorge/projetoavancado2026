import java.util.ArrayList;
import java.util.Objects;

public class ArrayListAlunoAdapter implements RepositorioAluno {
    private final ArrayList<Aluno> alunos;

    public ArrayListAlunoAdapter(ArrayList<Aluno> alunos) {
        this.alunos = Objects.requireNonNull(alunos, "A lista adaptada nao pode ser nula.");
    }

    @Override
    public boolean cadastrar(Aluno aluno) {
        Objects.requireNonNull(aluno, "O aluno nao pode ser nulo.");

        if (buscar(aluno.getMatricula()) != null) {
            return false;
        }

        return alunos.add(aluno);
    }

    @Override
    public Aluno buscar(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    @Override
    public boolean excluir(String matricula) {
        Aluno aluno = buscar(matricula);
        return aluno != null && alunos.remove(aluno);
    }

    @Override
    public int quantidade() {
        return alunos.size();
    }

    @Override
    public void listar() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
