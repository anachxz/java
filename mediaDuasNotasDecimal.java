import java.util.Scanner;

public class mediaDuasNotasDecimal {
    public static void main(String[] args) {
        /*
        Crie um programa que realize a média de duas notas decimais e exiba o resultado.
         */
        System.out.println("Insira a nota 1: ");
        double nota1 = new  Scanner(System.in).nextDouble();
        System.out.println("Insira a nota 2: ");
        double nota2 = new  Scanner(System.in).nextDouble();
        double media = (nota1 + nota2) /2;
        System.out.println("Media duas notas: " + media);
    }
}
