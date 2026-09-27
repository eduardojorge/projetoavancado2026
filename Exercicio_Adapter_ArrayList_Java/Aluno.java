import java.util.Objects;

public class Aluno {
    private final String matricula;
    private final String nome;
    private final String email;

    public Aluno(String matricula, String nome, String email) {
        this.matricula = Objects.requireNonNull(matricula, "A matricula nao pode ser nula.");
        this.nome = Objects.requireNonNull(nome, "O nome nao pode ser nulo.");
        this.email = Objects.requireNonNull(email, "O e-mail nao pode ser nulo.");
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
