import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número inteiro não negativo: ");
        int n = sc.nextInt();

        // Validação: fatorial não definido para negativos
        if (n < 0) {
            System.out.println("Fatorial não definido para números negativos.");

        }

        // Usa long para suportar factorials maiores
        long fat = 1;
        // Multiplica  por cada valor de 2 até n
        for (int i = 2; i <= n; i++) {
            fat *= i; // equivalente a fat = fat * i
        }

        // Exibe o resultado
        System.out.println(n + "! = " + fat);


    }
}
