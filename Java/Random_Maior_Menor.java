/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.pkg03;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guiol
 */
public class Random_Maior_Menor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um algoritmo que leia dois n�meros inteiros e realize o sorteio de um n�mero 
	aleat�rio. O algoritmo deve validar qual � o menor e o maior n�mero informado pelo 
	teclado, para que independente da ordem que o usu�rio digite os n�meros, consiga 
	realizar o sorteio.
	Se o algoritmo gerar um n�mero par, escreva na tela o n�mero gerado e informe que 
	ele � par. Se o algoritmo gerar um n�mero �mpar, escreva na tela o n�mero gerado e 
	que ele � um n�mero �mpar.*/
        
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();
        int n1, n2, random, maiorN, menorN;
        
        System.out.println("Informe o primeiro n�mero: ");
	n1 = input.nextInt();
	System.out.println("Informe o segundo n�mero: ");
	n2 = input.nextInt();

	if (n1<n2) {
            System.out.println("\nO n�mero menor �: " + n1);
            System.out.println("O n�mero maior �: " + n2);
        } else {
            System.out.println("O n�mero menor �: " + n2);
            System.out.println("O n�mero maior �: " + n1);
	}
        
        if (n1<n2) {
            maiorN = n2;
            menorN = n1;
	} else {
            maiorN = n1;	
            menorN = n2;
        }
        
        random = aleatorio.nextInt(menorN, maiorN);
        System.out.println("O n�mero sortiado foi: " + random);
        
        if (random < 0) {
            System.out.println(random + " � �mpar");
        } else {
            System.out.println(random + " � par");
        }
        // TODO code application logic here
    }
    
}
