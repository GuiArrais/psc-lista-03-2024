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
public class Perimetro_Area_Volume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um algoritmo que leia dois valores: o primeiro servindo de indicador de 
	opera��o e o segundo correspondendo ao raio de um c�rculo ou esfera. Caso o 
	primeiro valor lido seja:
	a. 1: calcular e imprimir o per�metro do c�rculo.
	b. 2: calcular e imprimir a �rea do c�rculo.
	c. 3: calcular e imprimir o volume da esfera.
	Se o primeiro valor lido for diferente desses tr�s valores poss�veis, imprimir uma 
	mensagem de erro, informando que o c�digo da opera��o � inv�lido.
	OBS:
	Per�metro de um c�rculo: 2 ? r
	�rea de um c�rculo: ? r�
	Volume de uma esfera: 4/3 ? r�
	em que ? = 3,141592 e r � o raio da circunfer�ncia.*/
        
        Scanner input = new Scanner(System.in);
        double raio, perimetro, area, volume, pi;
	int opcao;
	pi = 3.141592;
        
        System.out.println("Op��o 1: Calcular o per�metro de um c�rculo ou esfera");
        System.out.println("\nOp��o 2: Calcular a �rea de um c�rculo ou esfera");
        System.out.println("\nOp��o 3: Calcular o volume de uma esfera");
        
        System.out.println("\n\n Escolha uma das 3 op��es citadas acima (use apenas n�meros) \n");
        opcao = input.nextInt();
        
        if (opcao < 1 || opcao > 3) {
            System.out.println("ERRO \n C�digo da opera��o inv�lido \n Digite um n�mero v�lido (1, 2 ou 3)");
        } else {
            System.out.println("Quantos cent�metros tem o raio: ");
            raio = input.nextDouble();

	perimetro = 2 * 3.141592 * raio;
	area = 3.141592 * (raio * raio);
	volume = (4 * 3.141592 * (raio * raio * raio)) / 3;


	switch (opcao) {
            case 1 -> System.out.printf("Perimetro = %.2f cm \n", perimetro);
            case 2 -> System.out.printf("Area: %.2f cm \n", area);
            case 3 -> System.out.printf("Volume: %.2f cm \n", volume);
        }
        }
        // TODO code application logic here
    }
    
}
