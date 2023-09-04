import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Suelen Felizardo";
        String tipoConta = "Corrente";
        double saldo = 2000.00;

        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");

        int opcao = 0;
        String menu = """
                ♥ Digite sua opção ♥
                1- Consultar saldo
                2- Receber
                3- Transferir
                4- Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente para essa transferência!");
                } else {
                    saldo -= valor;
                    System.out.println("Transferência realizada com sucesso! Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}