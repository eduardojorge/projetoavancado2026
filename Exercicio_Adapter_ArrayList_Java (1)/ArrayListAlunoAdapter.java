
import java.util.*;

public class ArrayListAlunoAdapter implements RepositorioAluno {
    private ArrayList alunos;

    public ArrayListAlunoAdapter(ArrayList alunos) {
        this.alunos = alunos;
    }

    @Override
    public boolean cadastrar(Aluno aluno) {
        if (buscar(aluno.getMatricula()) != null) {
            return false;
        }

        return alunos.add(aluno);
    }

    @Override
    public Aluno buscar(String matricula) {
           int index = this.alunos.indexOf(new Aluno(matricula, "", ""));
        if (index != -1) {  
            return (Aluno) this.alunos.get(index);
        }
        return null;

    }

    @Override
    public boolean excluir(String matricula) {
        int index = this.alunos.indexOf(new Aluno(matricula, "", ""));
        if (index != -1) {
            this.alunos.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public int quantidade() {
        return this.alunos.size();
    }

    @Override
    public String listar() {
        String temp = "";
        Iterator iterator = this.alunos.iterator();
        while (iterator.hasNext()) {
            Aluno aluno = (Aluno) iterator.next();
            temp += aluno.toString() + "\n";
        }

        
        return temp;
    
    }
}
