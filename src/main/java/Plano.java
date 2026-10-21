// Classe abstrata: serve de base para os planos e nao pode ser instanciada
public abstract class Plano implements Calculavel {

    protected String nome;
    protected double valorBase;

    public Plano(String nome, double valorBase) {
        this.nome = nome;
        this.valorBase = valorBase;
    }

    public String getNome() {
        return nome;
    }

    // Cada plano calcula a mensalidade do seu jeito
    @Override
    public abstract double calcularMensalidade();
}
