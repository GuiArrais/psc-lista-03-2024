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
        
        /*Escreva um algoritmo que leia 3 n�meros a partir do teclado.
        O algoritmo deve apresentar:
        a. O maior n�mero.
        b. O menor n�mero.
        c. A m�dia aritm�tica dos tr�s n�meros.*/
        
        Scanner input = new Scanner(System.in);
        float A, B, C, media;
		
        System.out.println("Digite o primeiro n�mero: ");
	A = input.nextFloat();
        
        System.out.println("Digite o segundo n�mero: ");
	B = input.nextFloat();

	System.out.println("Digite o terceiro n�mero: ");
	C = input.nextFloat();
		
        if (A > B && A > C) {
            System.out.println("O n�mero maior �: " + A);
        } else if (B > A && B > C) {
            System.out.println("O n�mero maior �: " + B);
	} else {
            System.out.println("O n�mero maior �: " + C);
        }
        
        if (A < B && A < C) {
            System.out.println("O n�mero menor �: " + A);
        } else if (B < A && B < C) {
            System.out.println("O n�mero menor �: " + B);
        } else
            System.out.println("O n�mero menor �: " + C);

	media = (A + B + C) / 3;
            System.out.printf("A m�dia aritm�tica �: %.2f \n", media);
    }
        // TODO code application logic here
}

