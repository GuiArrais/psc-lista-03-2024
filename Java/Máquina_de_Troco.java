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
public class Máquina_de_Troco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces, 
        ser dado de troco para um pagamento efetuado
        O algoritmo deve ler o valor da compra e o valor pago. Se o valor pago for menor que 
	o valor da compra, a máquina deve apresentar uma mensagem, informando que a 
	quantia paga é insuficiente para realizar a compra. A máquina aceita apenas notas de 
	R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00.
	Exemplo:
	Valor pago: R$ 100,00
	Valor da compra: R$ 23,00
	Troco: R$ 77,00
	Notas de R$ 50,00: 1
	Notas de R$ 20,00: 1
	Notas de R$ 10,00: 0
	Notas de R$ 5,00: 1
	Notas de R$ 2,00: 1
	Notas de R$ 1,00: 0*/
        
        Scanner input = new Scanner(System.in);
        int pago, compra, troco;
		
        System.out.println("A máquina aceita apenas notas de R$50,00, R$20,00, R$10,00, R$5,00, R$2,00 e R$1,00");
        System.out.println("Qual o valor pago?");
	pago = input.nextInt();

        System.out.println("Qual o valor da compra?");
	compra = input.nextInt();
        
        troco = pago - compra;

        System.out.println("Valor pago: R$" + pago);
        System.out.println("Valor da compra: R$" + compra);
        System.out.println("Troco: R$" + troco);

	if (pago < compra) {
            System.out.println("A quantia paga é insuficiente para realizar a compra");
        }
        //NOTA DE 50,00
	if (troco >= 50) {
            System.out.println("Notas de R$50,00: 1");
	} else {
            System.out.println("Notas de R$50,00: 0");
	} 
	//NOTA DE 20,00
	if (troco < 50 && troco >= 40) {
            System.out.println("Notas de R$20,00: 2");
	} else if ((troco - 50) < 50 && (troco - 50) >=40) {
            System.out.println("Notas de R$20,00: 2");
	} else if (troco < 40 && troco >= 20) {
            System.out.println("Notas de R$20,00: 1");
	} else if ((troco - 50) < 40 && (troco - 50) >=20) {
            System.out.println("Notas de R$20,00: 1");
	} else {
            System.out.println("Notas de R$20,00: 0");
	}
	//NOTA DE 10,00
	if (troco < 90 && troco >= 80) {
            System.out.println("Notas de R$10,00: 1");
	} else if (troco < 70 && troco >= 60) {
            System.out.println("Notas de R$10,00: 1");	
	} else if (troco < 40 && troco >= 30) {
        System.out.println("Notas de R$10,00: 1");
	} else if (troco < 20 && troco >= 10) {
            System.out.println("Notas de R$10,00: 1");
	} else {
            System.out.println("Notas de R$10,00: 0");
	}
	//NOTA DE 5,00
	if(troco < 100 && troco >= 95) {
            System.out.println("Notas de R$5,00: 1");
	} else if (troco < 90 && troco >= 85) {
            System.out.println("Notas de R$5,00: 1");
	}else if (troco < 80 && troco >= 75) {
            System.out.println("Notas de R$5,00: 1");
	} else if (troco < 70 && troco >= 65) {
            System.out.println("Notas de R$5,00: 1");
	} else if (troco < 60 && troco >= 55) {
            System.out.println("Notas de R$5,00: 1");
	} else if (troco < 50 && troco >= 45) {
            System.out.println("Notas de R$5,00: 1");
	} else if (troco < 40 && troco >= 35) {
            System.out.println("Notas de R$5,00: 1");
	} else if (troco < 30 && troco >= 25) {
            System.out.println("Notas de R$5,00: 1");
	} else if (troco < 20 && troco >= 15) {
            System.out.println("Notas de R$5,00: 1");
	} else if (troco < 10 && troco >= 5) {
            System.out.println("Notas de R$5,00: 1");
	} else  {
            System.out.println("Notas de R$5,00: 0");
	}
        //NOTA DE 2,00 (2 NOTAS), NUMEROS TERMINADOS EM "9" E "4"
        switch (troco) {
            case 99, 94 -> System.out.println("Notas de 2,00: 2");
            case 89, 84 -> System.out.println("Notas de 2,00: 2");
            case 79, 74 -> System.out.println("Notas de 2,00: 2");
            case 69, 64 -> System.out.println("Notas de 2,00: 2");
            case 59, 54 -> System.out.println("Notas de 2,00: 2");
            case 49, 44 -> System.out.println("Notas de 2,00: 2");
            case 39, 34 -> System.out.println("Notas de 2,00: 2");
            case 29, 24 -> System.out.println("Notas de 2,00: 2");
            case 19, 14 -> System.out.println("Notas de 2,00: 2");
            case 9, 4 -> System.out.println("Notas de 2,00: 2");
                default -> {
            }
        }
        //NOTAS DE 2,00 (1 NOTA), NUMEROS TERMINADOS EM "8", "7", "3" E "2"
        switch (troco) {
            case 98, 97, 93, 92 -> System.out.println("Notas de 2,00: 1");
            case 88, 87, 83, 82 -> System.out.println("Notas de 2,00: 1");
            case 78, 77, 73, 72 -> System.out.println("Notas de 2,00: 1");
            case 68, 67, 63, 62 -> System.out.println("Notas de 2,00: 1");
            case 58, 57, 53, 52 -> System.out.println("Notas de 2,00: 1");
            case 48, 47, 43, 42 -> System.out.println("Notas de 2,00: 1");
            case 38, 37, 33, 32 -> System.out.println("Notas de 2,00: 1");
            case 28, 27, 23, 22 -> System.out.println("Notas de 2,00: 1");
            case 18, 17, 13, 12 -> System.out.println("Notas de 2,00: 1");
            case 8, 7, 3, 2 -> System.out.println("Notas de 2,00: 1");
                default -> System.out.println("Notas de R$2,00: 0");
        }
        //NOTA DE 1,00, NUMEROS TERMINADOS EM "8", "6", "3" E "1"
        switch (troco) {
            case 98, 96, 93, 91 -> System.out.println("Notas de 1,00: 1");
            case 88, 86, 83, 81 -> System.out.println("Notas de 1,00: 1");
            case 78, 76, 73, 71 -> System.out.println("Notas de 1,00: 1");
            case 68, 66, 63, 61 -> System.out.println("Notas de 1,00: 1");
            case 58, 56, 53, 51 -> System.out.println("Notas de 1,00: 1");
            case 48, 46, 43, 41 -> System.out.println("Notas de 1,00: 1");
            case 38, 36, 33, 31 -> System.out.println("Notas de 1,00: 1");
            case 28, 26, 23, 21 -> System.out.println("Notas de 1,00: 1");
            case 18, 16, 13, 11 -> System.out.println("Notas de 1,00: 1");
            case 8, 6, 3, 1 -> System.out.println("Notas de 1,00: 1");
                default -> System.out.println("Notas de R$1,00: 0");
        }
        // TODO code application logic here
    }
    
}
