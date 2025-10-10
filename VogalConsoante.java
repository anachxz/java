import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma frase: ");
        String frase = sc.nextLine();

       //evitar erro com letras maiúsculas
        frase = frase.toLowerCase();

        int vogais = 0;
        int consoantes = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            // Verifica se é letra
            if (caracter >= 'a' && caracter <= 'z') {
                // Verifica se é vogal
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        System.out.println("Número de vogais: " + vogais);
        System.out.println("Número de consoantes: " + consoantes);

    }
}



