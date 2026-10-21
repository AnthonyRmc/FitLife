import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    public void deveCadastrarClienteValido() {
        Cliente cliente = new Cliente("Joao", "joao@email.com", 20);
        assertEquals("Joao", cliente.getNome());
    }

    @Test
    public void naoDeveCadastrarClienteMenorDeIdade() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cliente("Joao", "joao@email.com", 14));
    }

    @Test
    public void naoDeveCadastrarEmailInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cliente("Joao", "email-invalido", 20));
    }

    @Test
    public void deveAdicionarTreino() {
        Cliente cliente = new Cliente("Joao", "joao@email.com", 20);
        cliente.adicionarTreino(new Treino("Pernas", 4, 12));
        assertEquals(1, cliente.getTreinos().size());
    }
}
