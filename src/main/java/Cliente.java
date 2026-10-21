import java.util.ArrayList;
import java.util.List;

public class Cliente {

    // Encapsulamento: atributos privados, acesso so por getters e setters
    private String nome;
    private String email;
    private int idade;
    private Plano plano;                                // associacao com Plano
    private List<Treino> treinos = new ArrayList<>();   // cliente tem treinos

    // Construtor com validacao de dados
    public Cliente(String nome, String email, int idade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome e obrigatorio!");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email invalido!");
        }
        if (idade < 15) {
            throw new IllegalArgumentException("Idade minima e 15 anos!");
        }
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public Plano getPlano() {
        return plano;
    }

    // Associa um plano ao cliente
    public void setPlano(Plano plano) {
        if (plano == null) {
            throw new IllegalArgumentException("Plano invalido!");
        }
        this.plano = plano;
    }

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void adicionarTreino(Treino treino) {
        if (treino == null) {
            throw new IllegalArgumentException("Treino invalido!");
        }
        treinos.add(treino);
    }

    @Override
    public String toString() {
        String nomePlano = (plano == null) ? "sem plano" : plano.getNome();
        return "Cliente: " + nome + " | Email: " + email + " | Idade: " + idade
                + " | Plano: " + nomePlano + " | Treinos: " + treinos.size();
    }
}
