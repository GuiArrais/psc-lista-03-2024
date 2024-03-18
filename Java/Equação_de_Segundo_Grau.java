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
public class Equação_de_Segundo_Grau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um algoritmo que resolva uma equação de segundo grau, realizando a 
	verificação de consistência dos valores dos coeficientes ("a", "b" e "c") e do 
	discriminante (delta).
	a. Se os coeficientes "a" e "b" forem iguais a zero e o coeficiente "c" for diferente de 
	zero, apresentar a mensagem "Coeficientes informados incorretamente.".
	b. Caso o coeficiente "a" seja igual a zero e o coeficiente "b" for diferente de zero, 
	deverá ser impressa a mensagem: "Essa é uma equação de primeiro grau" e deverá 
	ser informado o valor da raiz real da equação.
	c. Caso o discriminante seja negativo, deverá ser impressa a mensagem: "Esta 
	equação não possui raízes reais".
	d. Caso o discriminante seja zero, apresentar a mensagem "Esta equação possui duas 
	raízes reais iguais. " e informar o valor das raízes da equação.
	e. Caso o discriminante seja maior que zero, apresentar a mensagem "Esta equação 
	possui duas raízes reais diferentes. " e informar o valor das raízes da equação.
	Equação do segundo grau: ax² + bx + c = 0
	Discriminante: delta = b² ? 4ac*/
        
        Scanner input = new Scanner(System.in);
        double a, b, c, delta, x1, x2, equac1grau;

	System.out.println("ax² + bx + c = 0");
	System.out.println("\nInforme o valor de 'a': ");
	a = input.nextDouble();

	System.out.println("Informe o valor de 'b': ");
	b = input.nextDouble();

	System.out.println("Informe o valor de 'c': ");
	c = input.nextDouble();

	delta = (b*b) - (4*a*c);
	x1 = (-b + Math.sqrt(delta)) / (2 * a);
	x2 = (-b - Math.sqrt(delta)) / (2 * a);

	if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
	} 
	//Equação de 1° grau
	else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau");
	equac1grau = (c / b);
            System.out.println("O valor da raiz real da equação é: " + equac1grau);
        }	
	//Delta negativo
	else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais");
        }
	//Delta igual a 0
	else if (delta == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais");
            System.out.printf("O valor da primeira raiz é: %.2f \n", x1);
            System.out.printf("O valor da segunda raiz é: %.2f \n", x2);
        }
        //Delta > 0
	else if (delta > 0) {
            System.out.println("Esta equação possui duas raízes reais diferentes");
            System.out.printf("O valor da primeira raiz é: %.2f \n", x1);
            System.out.printf("O valor da segunda raiz é: %.2f \n", x2);	}
        // TODO code application logic here
    }
    
}
