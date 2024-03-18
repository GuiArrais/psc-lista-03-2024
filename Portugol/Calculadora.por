programa
{		
		/*Escrever um algoritmo que leia a partir do teclado dois números reais e um dos 
		símbolos de operação: + , - , * , / ou ^ . 
		O algoritmo deve retornar o resultado da operação. 
		Caso o símbolo informado seja diferente dos símbolos preestabelecidos, o algoritmo 
		deve apresentar uma mensagem de erro, informando que o símbolo da operação é 
		inválido.*/

		inclua biblioteca Matematica-->mat
		
	funcao inicio()
	{
		real n1, n2, adicao, subtracao, multiplicacao, divisao, potenciacao
		inteiro simbolo
		escreva("Digite o primeiro número: ")
		leia(n1)

		escreva("Digite o segundo número: ")
		leia(n2)

		escreva("\n Qual símbolo de operação deseja utilizar: \n")
		escreva("1. + \n")
		escreva("2. - \n")
		escreva("3. * \n")
		escreva("4. / \n")
		escreva("5. ^ \n\n")
		leia(simbolo)

		adicao = n1 + n2
		subtracao = n1 - n2
		multiplicacao = n1 * n2
		divisao = n1 / n2
		potenciacao = mat.potencia(n1,n2)

		escolha (simbolo) {
			caso 1: 
				escreva(" \n " + n1 + " + " + n2 + " = " + adicao)
				pare
			caso 2: 
				escreva(" \n " + n1 + " - " + n2 + " = " + subtracao)
				pare
			caso 3: 
				escreva(" \n " + n1 + " * " + n2 + " = " + multiplicacao)
				pare
			caso 4: 
				escreva(" \n " + n1 + " / " + n2 + " = " + divisao)
				pare
			caso 5: 
				escreva(" \n " + n1 + " ^ " + n2 + " = " + potenciacao)
				pare				
				
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 794; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */