import java.util.Scanner;

public class saldo {
    public static void main(String[] args) {
        String nome = "Ana Clara";
        String tipoConta = "Corrente";
        double saldo = 1500.50;
        int opcao = 0;

        System.out.println("*************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("\nSaldo da conta: " + saldo);
        System.out.println("\n*************");

        String menu = """
                **Digite sua opção**
                1-Consultar saldo
                2-Transferir valor
                3-Receber valor
                4-Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            double valor;
            if (opcao == 1) {
                System.out.println("O saldo atulizado é :" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?: ");
                valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Esse valor não pode ser transferido");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valorSaldo = leitura.nextDouble();
                saldo += valorSaldo;
                System.out.println("Novo saldo: " + saldo);

            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
        }
    }

