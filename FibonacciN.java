import java.util.Scanner;

public class FibonacciN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos termos da sequência Fibonacci você quer? ");
        int N = sc.nextInt();

        //  N > 0
        if (N <= 0) {
            System.out.println("Informe um N maior que 0.");
        }

        // a =  atual, b = próximo ; começa em 0 e 1
        long a = 0, b = 1;
        // Itera N vezes para imprimir os N primeiros termos
        for (int i = 1; i <= N; i++) {
            // Imprime o  atual;
            System.out.print(a + (i == N ? "" : ", "));
            // Calcula o próximo termo e atualiza a e b
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); // quebra de linha ao final


    }
}
