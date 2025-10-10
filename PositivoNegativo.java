import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        System.out.println("Digite um numero : ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if(numero>0) {
            System.out.println("O número é positivo");
        } else if (numero<0) {
            System.out.println("O número é negativo");
        }else {
            sc.close();
        }
    }

        }



