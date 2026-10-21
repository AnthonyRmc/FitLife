// Heranca: PlanoPremium e um Plano
public class PlanoPremium extends Plano {

    public PlanoPremium() {
        super("Premium", 200.0);
    }

    // Polimorfismo: mesmo metodo, resultado diferente do PlanoMensal
    @Override
    public double calcularMensalidade() {
        return valorBase + 50.0;
    }
}
