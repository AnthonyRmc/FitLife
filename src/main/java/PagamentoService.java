public class PagamentoService {

    // Processa o pagamento da mensalidade e devolve o valor pago
    public double processarPagamento(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente invalido!");
        }
        if (cliente.getPlano() == null) {
            throw new IllegalArgumentException("Cliente sem plano!");
        }

        double valor = cliente.getPlano().calcularMensalidade();

        System.out.println("Processando pagamento...");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.printf("Valor: R$ %.2f%n", valor);
        System.out.println("Pagamento realizado com sucesso!");

        return valor;
    }
}
