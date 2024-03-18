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
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escrever um algoritmo que leia a partir do teclado dois números reais e um dos 
	símbolos de operação: + , - , * , / ou ^ . 
	O algoritmo deve retornar o resultado da operação. 
	Caso o símbolo informado seja diferente dos símbolos preestabelecidos, o algoritmo 
	deve apresentar uma mensagem de erro, informando que o símbolo da operação é 
	inválido.*/
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        double n1, n2, adicao, subtracao, multiplicacao, divisao, potenciacao;
	int simbolo;
	System.out.println("Digite o primeiro número: ");
	n1 = input.nextDouble();

	System.out.println("Digite o segundo número: ");
	n2 = input.nextDouble();

	System.out.println("\n Qual símbolo de operação deseja utilizar:");
        System.out.println("1. + ");
        System.out.println("2. - ");
        System.out.println("3. * ");
        System.out.println("4. / ");
        System.out.println("5. ^ \n");
	simbolo = input.nextInt();

	adicao = n1 + n2;
	subtracao = n1 - n2;
	multiplicacao = n1 * n2;
	divisao = n1 / n2;
	potenciacao = Math.pow(n1,n2);
        
        switch (simbolo) {
            case 1 -> System.out.println(n1 + " + " + n2 + " = " + adicao);
            case 2 -> System.out.println(n1 + " - " + n2 + " = " + subtracao);
            case 3 -> System.out.println(n1 + " * " + n2 + " = " + multiplicacao);
            case 4 -> System.out.println(n1 + " / " + n2 + " = " + divisao);
            case 5 -> System.out.println(n1 + " ^ " + n2 + " = " + potenciacao);
        }
    }
}
