import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args) {
        System.out.println("Digite o primero numero inteiro: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");
        }


        if (num1 > num2) {
            System.out.println("O número 1 é maior que o número 2");
        } else if (num2 > num1) {
            System.out.println("O número 2 é maior que o número 1");
        }

        sc.close();
    }
}