import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os 10 nomes: ");
        // Lendo os nomes e armazenando no vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nomes[i]=sc.nextLine();
    }
        System.out.println("Array original: " + Arrays.toString(nomes));

        // Invertendo o array
        Collections.reverse(Arrays.asList(nomes));
        System.out.println("Array invertido: " + Arrays.toString(nomes));
    }



