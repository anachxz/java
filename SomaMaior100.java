//Escreva um algoritmo que pede para o usuário digitar números até
//que a soma desses números seja maior que 100

import java.util.Scanner;

public class SomaMaior100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int soma=0;

        while(soma<=100){
            System.out.println("Digite um numero: ");
            num = sc.nextInt();
            soma+=num;
            }
        System.out.println("A soma fnal foi: "+soma);

        }

    }
