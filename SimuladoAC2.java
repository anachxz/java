import java.util.Scanner;

public class SimuladoAC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limiteMinimo = 0;
        int numProdutos = 0;

        // Entrada do limite mínimo
        System.out.println("=== SISTEMA DE CONTROLE DE ESTOQUE ===");
        System.out.print("Informe o limite mínimo de estoque (maior que 0): ");
        limiteMinimo = sc.nextInt();

        while (limiteMinimo <= 0) {
            System.out.println("Erro! O limite mínimo deve ser maior que 0.");
            System.out.print("Informe novamente: ");
            limiteMinimo = sc.nextInt();
        }

        // Entrada do número de produtos
        System.out.print("\nInforme o número total de produtos: ");
        numProdutos = sc.nextInt();

        while (numProdutos <= 0) {
            System.out.println("Erro! Digite um número maior que 0.");
            System.out.print("Informe novamente: ");
            numProdutos = sc.nextInt();
        }

        String[] nomes = new String[numProdutos];
        int[] quantidades = new int[numProdutos];
        String[] status = new String[numProdutos];

        // Limpar buffer antes de ler nomes
        sc.nextLine();

        System.out.println("\n--- CADASTRO DOS PRODUTOS ---");
        for (int i = 0; i < numProdutos; i++) {
            System.out.println("\nProduto " + (i + 1) + ":");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Quantidade em estoque: ");
            quantidades[i] = sc.nextInt();

            while (quantidades[i] < 0) {
                System.out.println("Erro! Quantidade não pode ser negativa.");
                System.out.print("Informe novamente: ");
                quantidades[i] = sc.nextInt();
            }

            // Limpa buffer do teclado
            sc.nextLine();

            // Classificação
            if (quantidades[i] >= limiteMinimo) {
                status[i] = "Adequado";
            } else if (quantidades[i] >= limiteMinimo / 2) {
                status[i] = "Baixo";
            } else {
                status[i] = "Crítico";
            }

            System.out.println("Status: " + status[i]);
        }

        // Relatório geral
        System.out.println("\n=== RELATÓRIO GERAL ===");
        int totalEstoque = 0;
        int contAdequado = 0;
        int contBaixo = 0;
        int contCritico = 0;

        for (int i = 0; i < numProdutos; i++) {
            System.out.println("Produto: " + nomes[i] + " | Quantidade: " + quantidades[i] + " | Status: " + status[i]);
            totalEstoque += quantidades[i];

            if (status[i].equals("Adequado")) {
                contAdequado++;
            } else if (status[i].equals("Baixo")) {
                contBaixo++;
            } else {
                contCritico++;
            }
        }

        System.out.println("\nTotal em estoque: " + totalEstoque + " unidades");

        double pctAdequado = (contAdequado * 100.0) / numProdutos;
        double pctBaixo = (contBaixo * 100.0) / numProdutos;
        double pctCritico = (contCritico * 100.0) / numProdutos;

        System.out.println("Porcentagem Adequado: " + pctAdequado + "%");
        System.out.println("Porcentagem Baixo: " + pctBaixo + "%");
        System.out.println("Porcentagem Crítico: " + pctCritico + "%");

        // Cálculo de reposição
        int estoqueIdeal = 0;
        System.out.print("\nInforme o estoque ideal desejado: ");
        estoqueIdeal = sc.nextInt();

        while (estoqueIdeal <= 0) {
            System.out.println("Erro! O estoque ideal deve ser maior que 0.");
            System.out.print("Informe novamente: ");
            estoqueIdeal = sc.nextInt();
        }

        System.out.println("\n--- RELATÓRIO DE REPOSIÇÃO ---");
        int totalRepor = 0;

        for (int i = 0; i < numProdutos; i++) {
            int falta = estoqueIdeal - quantidades[i];
            if (falta < 0) {
                falta = 0;
            }

            totalRepor += falta;

            if (falta == 0) {
                System.out.println("Produto: " + nomes[i] + " | Falta repor: 0 | Situação: OK");
            } else {
                System.out.println("Produto: " + nomes[i] + " | Falta repor: " + falta + " | Situação: Repor");
            }
        }

        double porcentagemReposicao = (totalRepor * 100.0) / totalEstoque;

        System.out.println("\nTotal a repor: " + totalRepor + " unidades");
        System.out.println("Porcentagem de reposição: " + porcentagemReposicao + "%");

        System.out.println("\n=== FIM DO PROGRAMA ===");

        sc.close();
    }
}
