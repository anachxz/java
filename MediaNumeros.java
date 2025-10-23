//Faça um algoritmo que peça para o usuário digitar vários números e
//calcule a média desses números. O algoritmo deve parar quando o
//usuário digitar zero.

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        double contador=0;
        double soma=0;
        double media;
        System.out.println("Digite um numero para calcular a media( digite 0 para parar!):  ");
      while(true){
          num = sc.nextDouble();
          if(num==0){
              break;
          }
          soma+=num;
          contador++;
      }
      if(contador>0) {
          media = (double) soma / contador;
          System.out.println("A media foi: " + media);
      }else {
          System.out.println("Nenhum numero foi calculado!");
      }
    }
}
