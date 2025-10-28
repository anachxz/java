import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        System.out.println("Quantas pessoas deseja adicionar?");
        int quantidade = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade de " + nome + ":");
            int idade = Integer.parseInt(scanner.nextLine());

            listaDePessoas.add(new Pessoa(nome, idade));
        }

        System.out.println("\nTamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));
        System.out.println("Lista completa:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

        scanner.close();
    }
}
