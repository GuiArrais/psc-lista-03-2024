programa
{		/*Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces, 
		ser dado de troco para um pagamento efetuado. 
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
	
	funcao inicio()
	{
		inteiro pago, compra, troco
		
		escreva("A máquina aceita apenas notas de R$50,00, R$20,00, R$10,00, R$5,00, R$2,00 e R$1,00 \n")
		escreva("Qual o valor pago? \n")
		leia(pago)

		escreva("Qual o valor da compra? \n")
		leia(compra)

		troco = pago - compra

		escreva("\n Valor pago: R$", pago)
		escreva("\n Valor da compra: R$", compra)
		escreva("\n Troco: R$", troco)

		se (pago < compra) {
			escreva("A quantia paga é insuficiente para realizar a compra")
		}
		//NOTA DE 50,00
		 se (troco >= 50) {
			escreva("\n Notas de R$50,00: 1")	
		} senao {
			escreva("\n Notas de R$50,00: 0")
		} 
		//NOTA DE 20,00
		se (troco < 50 e troco >= 40) {
			escreva("\n Notas de R$20,00: 2")
		} senao se ((troco - 50) < 50 e (troco - 50) >=40) {
			escreva("\n Notas de R$20,00: 2")
		} senao se (troco < 40 e troco >= 20) {
			escreva("\n Notas de R$20,00: 1")
		} senao se ((troco - 50) < 40 e (troco - 50) >=20) {
			escreva("\n Notas de R$20,00: 1")
		} senao {
			escreva("\n Notas de R$20,00: 0")
		}
		//NOTA DE 10,00
		se (troco < 90 e troco >= 80) {
			escreva("\n Notas de R$10,00: 1")
		} senao se (troco < 70 e troco >= 60) {
			escreva("\n Notas de R$10,00: 1")		
		} senao se (troco < 40 e troco >= 30) {
			escreva("\n Notas de R$10,00: 1")
		} senao se (troco < 20 e troco >= 10) {
			escreva("\n Notas de R$10,00: 1")
		} senao {
			escreva("\n Notas de R$10,00: 0")
		}
		//NOTA DE 5,00
		se (troco < 100 e troco >= 95) {
			escreva("\n Notas de R$5,00: 1")
		} senao se (troco < 90 e troco >= 85) {
			escreva("\n Notas de R$5,00: 1")
		} senao se (troco < 80 e troco >= 75) {
			escreva("\n Notas de R$5,00: 1")
		} senao se (troco < 70 e troco >= 65) {
			escreva("\n Notas de R$5,00: 1")
		} senao se (troco < 60 e troco >= 55) {
			escreva("\n Notas de R$5,00: 1")
		} senao se (troco < 50 e troco >= 45) {
			escreva("\n Notas de R$5,00: 1")
		} senao se (troco < 40 e troco >= 35) {
			escreva("\n Notas de R$5,00: 1")
		} senao se (troco < 30 e troco >= 25) {
			escreva("\n Notas de R$5,00: 1")
		} senao se (troco < 20 e troco >= 15) {
			escreva("\n Notas de R$5,00: 1")
		} senao se (troco < 10 e troco >= 5) {
			escreva("\n Notas de R$5,00: 1")
		} senao {
			escreva("\n Notas de R$5,00: 0")
		}
		//NOTA DE 2,00 (2 NOTAS), NUMEROS TERMINADOS EM "9" E "4"
		se (troco == 99 ou troco == 94) {
			escreva("\n Notas de 2,00: 2")
		} senao se (troco == 89 ou troco == 84) {
			escreva("\n Notas de 2,00: 2")
		} senao se (troco == 79 ou troco == 74) {
			escreva("\n Notas de 2,00: 2")
		} senao se (troco == 69 ou troco == 64) {
			escreva("\n Notas de 2,00: 2")
		} senao se (troco == 59 ou troco == 54) {
			escreva("\n Notas de 2,00: 2")
		} senao se (troco == 49 ou troco == 44) {
			escreva("\n Notas de 2,00: 2")
		} senao se (troco == 39 ou troco == 34) {
			escreva("\n Notas de 2,00: 2")
		} senao se (troco == 29 ou troco == 24) {
			escreva("\n Notas de 2,00: 2")
		} senao se (troco == 19 ou troco == 14) {
			escreva("\n Notas de 2,00: 2")
		} senao se (troco == 9 ou troco == 4) {
			escreva("\n Notas de 2,00: 2")
		} 
		//NOTAS DE 2,00 (1 NOTA), NUMEROS TERMINADOS EM "8", "7", "3" E "2"
		se (troco == 98 ou troco == 97 ou troco == 93 ou troco == 92) {
			escreva("\n Notas de 2,00: 1")
		} senao se (troco == 88 ou troco == 87 ou troco == 83 ou troco == 82) {
			escreva("\n Notas de 2,00: 1")
		} senao se (troco == 78 ou troco == 77 ou troco == 73 ou troco == 72) {
			escreva("\n Notas de 2,00: 1")
		} senao se (troco == 68 ou troco == 67 ou troco == 63 ou troco == 62) {
			escreva("\n Notas de 2,00: 1")
		} senao se (troco == 58 ou troco == 57 ou troco == 53 ou troco == 52) {
			escreva("\n Notas de 2,00: 1")
		} senao se (troco == 48 ou troco == 47 ou troco == 43 ou troco == 42) {
			escreva("\n Notas de 2,00: 1")
		} senao se (troco == 38 ou troco == 37 ou troco == 33 ou troco == 32) {
			escreva("\n Notas de 2,00: 1")
		} senao se (troco == 28 ou troco == 27 ou troco == 23 ou troco == 22) {
			escreva("\n Notas de 2,00: 1")
		} senao se (troco == 18 ou troco == 17 ou troco == 13 ou troco == 12) {
			escreva("\n Notas de 2,00: 1")
		} senao se (troco == 8 ou troco == 7 ou troco == 3 ou troco == 2) {
			escreva("\n Notas de 2,00: 1")
		} senao {
			escreva("\n Notas de R$2,00: 0")
		}
		//NOTA DE 1,00, NUMEROS TERMINADOS EM "8", "6", "3" E "1"
		se (troco == 98 ou troco == 96 ou troco == 93 ou troco == 91) {
			escreva("\n Notas de 1,00: 1")
		} senao se (troco == 88 ou troco == 86 ou troco == 83 ou troco == 81) {
			escreva("\n Notas de 1,00: 1")
		} senao se (troco == 78 ou troco == 76 ou troco == 73 ou troco == 71) {
			escreva("\n Notas de 1,00: 1")
		} senao se (troco == 68 ou troco == 66 ou troco == 63 ou troco == 61) {
			escreva("\n Notas de 1,00: 1")
		} senao se (troco == 58 ou troco == 56 ou troco == 53 ou troco == 51) {
			escreva("\n Notas de 1,00: 1")
		} senao se (troco == 48 ou troco == 46 ou troco == 43 ou troco == 41) {
			escreva("\n Notas de 1,00: 1")
		} senao se (troco == 38 ou troco == 36 ou troco == 33 ou troco == 31) {
			escreva("\n Notas de 1,00: 1")
		} senao se (troco == 28 ou troco == 26 ou troco == 23 ou troco == 21) {
			escreva("\n Notas de 1,00: 1")
		} senao se (troco == 18 ou troco == 16 ou troco == 13 ou troco == 11) {
			escreva("\n Notas de 1,00: 1")
		} senao se (troco == 8 ou troco == 6 ou troco == 3 ou troco == 1) {
			escreva("\n Notas de 1,00: 1")
		} senao {
			escreva("\n Notas de R$1,00: 0")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1111; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */