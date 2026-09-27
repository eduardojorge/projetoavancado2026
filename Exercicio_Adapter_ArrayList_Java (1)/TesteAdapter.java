import java.util.ArrayList;

public class TesteAdapter {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        RepositorioAluno repositorio = new ArrayListAlunoAdapter(lista);

        repositorio.cadastrar(
                new Aluno("2026001", "Ana Silva", "ana@email.com"));
        repositorio.cadastrar(
                new Aluno("2026002", "Carlos Souza", "carlos@email.com"));
        repositorio.cadastrar(
                new Aluno("2026003", "Marina Santos", "marina@email.com"));

        boolean resultadoDuplicado = repositorio.cadastrar(
                new Aluno("2026002", "Outro aluno", "outro@email.com"));

        System.out.println("Cadastro duplicado realizado: " + resultadoDuplicado);

        System.out.println("\nAlunos cadastrados:");
        repositorio.listar();

        System.out.println("\nBusca pela matricula 2026002:");
        System.out.println(repositorio.buscar("2026002"));

        System.out.println("\nExclusao da matricula 2026001:");
        System.out.println(repositorio.excluir("2026001"));

        System.out.println("\nQuantidade de alunos: " + repositorio.quantidade());

        System.out.println("\nLista atualizada:");
        System.out.println(repositorio.listar());
    }
}
