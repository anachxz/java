import java.util.Scanner;

public class NumeroEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 0;
        double soma = 0;
        int contador = 0;

        System.out.println("Digite um número (digite 0 para parar):");

        while (true) {
            num = sc.nextDouble();

            if (num == 0) {
                System.out.println("\nEncerrando a entrada de dados...");
                break;
            }

            soma += num;
            contador++;

            System.out.println("Digite mais um número (digite 0 para parar):");
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("\nA média dos números digitados é: " + media);
        } else {
            System.out.println("\nNenhum número foi digitado, então não há média.");
        }

        sc.close();
    }
