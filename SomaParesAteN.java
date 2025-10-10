import java.util.Scanner;

public class SomaParesAteN {
    public static void main(String[] args) {
        // Leitura do valor N
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe N (inteiro, >=1): ");
        int N = sc.nextInt();

        // Acumulador para a soma dos pares
        int soma = 0;
        // Percorre todos os inteiros de 1 até N
        for (int i = 1; i <= N; i++) {
            // Verifica se i é par usando o operador módulo
            if (i % 2 == 0) {
                // Soma i ao acumulador quando for par
                soma += i;
            }
        }

        // Mostra o resultado final
        System.out.println("Soma dos pares de 1 até " + N + " = " + soma);


    }
}
