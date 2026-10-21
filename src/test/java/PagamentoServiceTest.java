import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PagamentoServiceTest {

    @Test
    public void deveProcessarPagamentoComPlano() {
        Cliente cliente = new Cliente("Joao", "joao@email.com", 20);
        cliente.setPlano(new PlanoPremium());
        double valor = new PagamentoService().processarPagamento(cliente);
        assertEquals(250.0, valor);
    }

    @Test
    public void naoDeveProcessarPagamentoSemPlano() {
        Cliente cliente = new Cliente("Joao", "joao@email.com", 20);
        assertThrows(IllegalArgumentException.class,
                () -> new PagamentoService().processarPagamento(cliente));
    }

    @Test
    public void naoDeveProcessarPagamentoComClienteNulo() {
        assertThrows(IllegalArgumentException.class,
                () -> new PagamentoService().processarPagamento(null));
    }
}
