import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PlanoTest {

    @Test
    public void deveCalcularMensalidadeDoPlanoMensal() {
        Plano plano = new PlanoMensal();
        assertEquals(100.0, plano.calcularMensalidade());
    }

    @Test
    public void deveCalcularMensalidadeDoPlanoPremium() {
        Plano plano = new PlanoPremium();
        assertEquals(250.0, plano.calcularMensalidade());
    }
}
