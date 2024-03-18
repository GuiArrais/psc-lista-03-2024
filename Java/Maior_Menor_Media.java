/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.pkg03;

import java.util.Scanner;

/**
 *
 * @author guiol
 */
public class Maior_Menor_Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Escreva um algoritmo que leia 3 números a partir do teclado.
        O algoritmo deve apresentar:
        a. O maior número.
        b. O menor número.
        c. A média aritmética dos três números.*/
        
        Scanner input = new Scanner(System.in);
        float A, B, C, media;
		
        System.out.println("Digite o primeiro número: ");
	A = input.nextFloat();
        
        System.out.println("Digite o segundo número: ");
	B = input.nextFloat();

	System.out.println("Digite o terceiro número: ");
	C = input.nextFloat();
		
        if (A > B && A > C) {
            System.out.println("O número maior é: " + A);
        } else if (B > A && B > C) {
            System.out.println("O número maior é: " + B);
	} else {
            System.out.println("O número maior é: " + C);
        }
        
        if (A < B && A < C) {
            System.out.println("O número menor é: " + A);
        } else if (B < A && B < C) {
            System.out.println("O número menor é: " + B);
        } else
            System.out.println("O número menor é: " + C);

	media = (A + B + C) / 3;
            System.out.printf("A média aritmética é: %.2f \n", media);
    }
        // TODO code application logic here
}

