//Escreva um algoritmo que solicita ao usuário uma senha e continua
//pedindo até que a senha digitada seja correta. (OBS: deixe uma senha
//fixa no código, definida por você)


import java.util.Objects;
import java.util.Scanner;


public class SenhaCorreta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "1234", tentativa;
        System.out.println("Digite a senha até acertar: ");

        while (true) {
            System.out.println("Senha: ");
            tentativa = sc.next();

            if ((Objects.equals(tentativa, senha))) {
                System.out.println("Senha correta!");
                break;
            } else {
                System.out.println("Senha incorreta!");
            }
        }
    }
}
