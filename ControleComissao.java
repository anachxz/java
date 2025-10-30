import java.util.Scanner;

public class ControleComissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos vendedores: ");
        int quantidade = sc.nextInt();

        System.out.print("Qual a porcentagem de comissao: ");
        double porcentagem = sc.nextDouble() / 100;

        double[] totaisDeVendas = new double[quantidade];
        String[] nomesVendedores = new String[quantidade];
        double[] comissaoVendas = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome do vendedor: ");
            nomesVendedores[i] = sc.next();

            double tempVendas;
            do {
                System.out.print("Digite as vendas: ");
                tempVendas = sc.nextDouble();
            } while (tempVendas < 0);

            totaisDeVendas[i] = tempVendas;
        }

        System.out.println("\nResumo das vendas e comissões:");
        for (int i = 0; i < quantidade; i++) {
            comissaoVendas[i] = totaisDeVendas[i] * porcentagem;
            System.out.println("Vendedor: " + nomesVendedores[i]);
            System.out.println("  Vendas: R$" + totaisDeVendas[i]);
            System.out.println("  Comissão: R$" + comissaoVendas[i]);
        }

        sc.close();
    }
}
