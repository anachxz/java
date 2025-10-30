import java.util.Scanner;

public class VetorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;
        System.out.println("Média dos números inseridos: " + media);
    }
}
