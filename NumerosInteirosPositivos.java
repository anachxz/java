//Faça um algoritmo que pede para o usuário digitar números inteiros
//positivos. O algoritmo deve somar esses números e parar quando o
//usuário digitar um número negativo


import java.util.Scanner;

public class NumerosInteirosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int soma=0;
        int contador=0;
        System.out.println("Digite um numero inteiro positivo(digite um numero " +
                "negativo para parar!) : ");
        while(true){
            num = sc.nextInt();
            if(num<0){
                System.out.println("\nEncerrando a entrada de dados...");
                break;
            }
            soma+=num;
            contador++;
            System.out.println("Numero"+num+"adicionado com sucesso!");
            System.out.println("Soma atual: "+soma);
        }
        if(contador>0) {
            soma=soma+contador;
            System.out.println("A soma foi: " + soma);
        }else {
            System.out.println("Nenhuma soma foi calculada!");
    }
}
}
