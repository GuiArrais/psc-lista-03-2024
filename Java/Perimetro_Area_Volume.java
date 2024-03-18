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
	operação e o segundo correspondendo ao raio de um círculo ou esfera. Caso o 
	primeiro valor lido seja:
	a. 1: calcular e imprimir o perímetro do círculo.
	b. 2: calcular e imprimir a área do círculo.
	c. 3: calcular e imprimir o volume da esfera.
	Se o primeiro valor lido for diferente desses três valores possíveis, imprimir uma 
	mensagem de erro, informando que o código da operação é inválido.
	OBS:
	Perímetro de um círculo: 2 ? r
	Área de um círculo: ? r²
	Volume de uma esfera: 4/3 ? r³
	em que ? = 3,141592 e r é o raio da circunferência.*/
        
        Scanner input = new Scanner(System.in);
        double raio, perimetro, area, volume, pi;
	int opcao;
	pi = 3.141592;
        
        System.out.println("Opção 1: Calcular o perímetro de um círculo ou esfera");
        System.out.println("\nOpção 2: Calcular a área de um círculo ou esfera");
        System.out.println("\nOpção 3: Calcular o volume de uma esfera");
        
        System.out.println("\n\n Escolha uma das 3 opções citadas acima (use apenas números) \n");
        opcao = input.nextInt();
        
        if (opcao < 1 || opcao > 3) {
            System.out.println("ERRO \n Código da operação inválido \n Digite um número válido (1, 2 ou 3)");
        } else {
            System.out.println("Quantos centímetros tem o raio: ");
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
