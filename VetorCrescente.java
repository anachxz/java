//seguida, o programa deve ordenar o vetor em ordem crescente e exibir o
//resultado


import java.util.Scanner;
import java.util.Arrays;

public class VetoresCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite os 10 números inteiros:");

        // Lendo os números e armazenando no vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Ordenando o vetor em ordem crescente
        Arrays.sort(numeros);

        // Exibindo o resultado
        System.out.println("\nNúmeros em ordem crescente:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        sc.close();
    }
}
