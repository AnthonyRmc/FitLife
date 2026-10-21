public class Main {

    public static void main(String[] args) {
        PagamentoService pagamentoService = new PagamentoService();

        try {
            // 1. Cadastrar cliente (nome, email, idade)
            Cliente cliente = new Cliente("Joao Silva", "joao@email.com", 25);

            // 2. Cadastrar planos (Mensal e Premium)
            Plano mensal = new PlanoMensal();
            Plano premium = new PlanoPremium();

            // 3. Associar um plano ao cliente
            cliente.setPlano(premium);

            // 4. Cadastrar treinos para o cliente
            cliente.adicionarTreino(new Treino("Peito e triceps", 4, 12));
            cliente.adicionarTreino(new Treino("Costas e biceps", 4, 10));

            // 5. Exibir informacoes no console
            System.out.println(cliente);
            for (Treino treino : cliente.getTreinos()) {
                System.out.println(" - " + treino);
            }

            // Polimorfismo: mesma chamada, valores diferentes
            System.out.println("Mensal: R$ " + mensal.calcularMensalidade());
            System.out.println("Premium: R$ " + premium.calcularMensalidade());

            // 6. Processar pagamento da mensalidade
            pagamentoService.processarPagamento(cliente);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Exemplo de tratamento de erro: cliente menor de idade
        try {
            new Cliente("Joao", "joao@email.com", 14);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
