programa
{		
		/*Escreva um algoritmo que leia dois valores: o primeiro servindo de indicador de 
		operação e o segundo correspondendo ao raio de um círculo ou esfera. Caso o 
		primeiro valor lido seja:
		a. 1: calcular e imprimir o perímetro do círculo.
		b. 2: calcular e imprimir a área do círculo.
		c. 3: calcular e imprimir o volume da esfera.
		Se o primeiro valor lido for diferente desses três valores possíveis, imprimir uma 
		mensagem de erro, informando que o código da operação é inválido.
		OBS:
		Perímetro de um círculo: 2 π r
		Área de um círculo: π r²
		Volume de uma esfera: 4/3 π r³
		em que π = 3,141592 e r é o raio da circunferência.*/
		inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real raio, perimetro, area, volume, pi, arredondaP, arredondaA, arredondaV
		inteiro opcao
		pi = 3.141592
		
		escreva("Opção 1: Calcular o perímetro de um círculo ou esfera")
		escreva("\nOpção 2: Calcular a área de um círculo ou esfera")
		escreva("\nOpção 3: Calcular o volume de uma esfera")

		escreva("\n\n Escolha uma das 3 opções citadas acima (use apenas números) \n")
		leia(opcao)

		se (opcao < 1 ou opcao > 3) {
			escreva("ERRO \n Código da operação inválido \n Digite um número válido (1, 2 ou 3)")
		} senao {

		escreva("Quantos centímetros tem o raio: ")
		leia(raio)

		perimetro = 2 * 3.141592 * raio
		area = 3.141592 * (raio * raio)
		volume = (4 * 3.141592 * (raio * raio * raio)) / 3

		arredondaP = mat.arredondar(perimetro, 2)
		arredondaA = mat.arredondar(area, 2)
		arredondaV = mat.arredondar(volume, 2)

		escolha (opcao) {
			caso 1:
				escreva("Perimetro = ", arredondaP, " cm")
				pare
			caso 2:
				escreva("Area: ", arredondaA, " cm")
				pare
			caso 3:
				escreva("Volume: ", arredondaV, " cm")
				pare		
		}
		}
	}
}
 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */