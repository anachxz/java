import java.util.Scanner;

public class MenuArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção: 1 ou 2?\n" +
                "1: ÁREA DO QUADRADO\n" +
                "2: ÁREA DO CÍRCULO\n ");

        int opcao = sc.nextInt();

        if(opcao==1) {
            System.out.println("Digite o lado do quadrado");
            double ladoQuadrado = sc.nextDouble();
            double areaQuadrado = ladoQuadrado * ladoQuadrado;
            System.out.println("A área do Quadrado é: " + areaQuadrado);
        }else if(opcao==2) {
            System.out.println("Digite o raio do circulo");
            double raio = sc.nextDouble();
            double areaCirculo = 3.14 * raio * raio;
            System.out.println("A área do círculo é : " + areaCirculo);
        }else {
            System.out.println("Opção invalidade! Escolha 1 ou 2");
        return;


    }
    }
}
