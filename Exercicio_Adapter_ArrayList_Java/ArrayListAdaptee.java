import java.util.ArrayList;

/**
 * Classe didatica que destaca o papel de Adaptee do exemplo.
 *
 * O Adapter utiliza os servicos herdados de ArrayList, mas os clientes
 * acessam a colecao exclusivamente pela interface RepositorioAluno.
 */
public class ArrayListAdaptee extends ArrayList<Aluno> {
    private static final long serialVersionUID = 1L;
}
