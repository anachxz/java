//Crie um algoritmo que simula uma máquina de venda automática. O
//usuário deve fornecer o valor do produto desejado e inserir o valor do
//pagamento até que o pagamento seja suficiente para comprar o
//produto.


import java.util.Scanner;

public class VendaAutomatica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorProduto;
        double pagamento;
        double somador = 0;

        System.out.print("Digite o valor do produto (R$): ");
        valorProduto = sc.nextDouble();

        do {
            System.out.printf("Falta pagar: R$ %.2f\n", (valorProduto - somador));
            System.out.print("Digite o valor do pagamento (R$): ");
            pagamento = sc.nextDouble();
            somador += pagamento;

            if (somador < valorProduto) {
                System.out.printf("Pagamento de R$ %.2f recebido. Ainda faltam R$ %.2f.\n\n",
                        pagamento, (valorProduto - somador));
            }
        } while (somador < valorProduto);

        double troco = somador - valorProduto;
        System.out.println("\nPagamento finalizado com sucesso!");

        if (troco > 0) {
            System.out.printf("Seu troco é de R$ %.2f\n", troco);
        }

        sc.close();
    }
}
