# FitLife

Sistema simples da academia FitLife feito em Java para a atividade pratica de POO.

## Funcionalidades
1. Cadastrar clientes (nome, email, idade) com validacao
2. Cadastrar planos Mensal e Premium
3. Associar um plano a um cliente
4. Cadastrar treinos para o cliente
5. Processar o pagamento da mensalidade
6. Validar dados e tratar erros
7. Exibir informacoes no console

## Conceitos aplicados
- Classes e objetos: Cliente, Treino
- Encapsulamento: atributos privados, getters e setters
- Heranca: PlanoMensal e PlanoPremium estendem Plano
- Classe abstrata: Plano
- Interface: Calculavel
- Polimorfismo: calcularMensalidade() muda conforme o plano
- Relacionamentos: Cliente tem Plano (associacao) e Treinos
- Tratamento de excecoes: IllegalArgumentException
- Testes: JUnit 5

## Como executar
Requisitos: Java 17 ou maior e Maven.

Rodar os testes:
    mvn test

Rodar o programa pela IDE (IntelliJ ou Eclipse): abra o projeto e execute a classe Main.

## Estrutura
    src/main/java   codigo do sistema
    src/test/java   testes JUnit
