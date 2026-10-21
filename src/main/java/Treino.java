public class Treino {

    private String nome;
    private int series;
    private int repeticoes;

    public Treino(String nome, int series, int repeticoes) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do treino e obrigatorio!");
        }
        if (series <= 0 || repeticoes <= 0) {
            throw new IllegalArgumentException("Series e repeticoes devem ser maiores que zero!");
        }
        this.nome = nome;
        this.series = series;
        this.repeticoes = repeticoes;
    }

    public String getNome() {
        return nome;
    }

    public int getSeries() {
        return series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    @Override
    public String toString() {
        return nome + " - " + series + "x" + repeticoes;
    }
}
