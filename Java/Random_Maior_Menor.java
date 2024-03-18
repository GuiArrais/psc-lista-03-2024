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
        /*Crie um algoritmo que leia dois números inteiros e realize o sorteio de um número 
	aleatório. O algoritmo deve validar qual é o menor e o maior número informado pelo 
	teclado, para que independente da ordem que o usuário digite os números, consiga 
	realizar o sorteio.
	Se o algoritmo gerar um número par, escreva na tela o número gerado e informe que 
	ele é par. Se o algoritmo gerar um número ímpar, escreva na tela o número gerado e 
	que ele é um número ímpar.*/
        
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();
        int n1, n2, random, maiorN, menorN;
        
        System.out.println("Informe o primeiro número: ");
	n1 = input.nextInt();
	System.out.println("Informe o segundo número: ");
	n2 = input.nextInt();

	if (n1<n2) {
            System.out.println("\nO número menor é: " + n1);
            System.out.println("O número maior é: " + n2);
        } else {
            System.out.println("O número menor é: " + n2);
            System.out.println("O número maior é: " + n1);
	}
        
        if (n1<n2) {
            maiorN = n2;
            menorN = n1;
	} else {
            maiorN = n1;	
            menorN = n2;
        }
        
        random = aleatorio.nextInt(menorN, maiorN);
        System.out.println("O número sortiado foi: " + random);
        
        if (random % 2 == 1) {
            System.out.println(random + " é ímpar");
        } else {
            System.out.println(random + " é par");
        }
        // TODO code application logic here
    }
    
}
