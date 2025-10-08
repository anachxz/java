import java.sql.SQLOutput;
import java.util.Scanner;

public class conversaoTemperatura {
    public static void main(String[] args) {
        /*
        Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
       Utilize variáveis para representar
        os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.
        */
        System.out.println("Escreva a temperatura em Celsius: ");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
         double  Fahrenheit = celsius * 1.8 + 32;
        System.out.println("A temperatura de "  +celsius+" em  Fahrenheit e: " + Fahrenheit);
    }
}
