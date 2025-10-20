/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetores;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int produtoEscalar = 0;

    
        System.out.println("Digite os 10 primeiros elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = input.nextInt();
        }

    
        System.out.println("Digite os 10 primeiros elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = input.nextInt();
        }

       
        for (int i = 0; i < 10; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }

  
        System.out.println("\nO produto escalar entre esses dois vetores é: " + produtoEscalar);
        
       
    }
}
