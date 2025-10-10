import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário um número inteiro
        System.out.print("Informe um número inteiro para ver a tabuada: ");
        // Lê o inteiro digitado e armazena em n
        int n = sc.nextInt();


        System.out.println("Tabuada de " + n + ":");
        // Laço de 1 a 10 para calcular e mostrar cada linha da tabuada
        for (int i = 1; i <= 10; i++) {
            // Imprime no formato
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }


    }
}
