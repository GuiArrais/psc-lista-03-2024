programa
{
		/*Crie um algoritmo que leia dois números inteiros e realize o sorteio de um número 
		aleatório. O algoritmo deve validar qual é o menor e o maior número informado pelo 
		teclado, para que independente da ordem que o usuário digite os números, consiga 
		realizar o sorteio.
		Se o algoritmo gerar um número par, escreva na tela o número gerado e informe que 
		ele é par. Se o algoritmo gerar um número ímpar, escreva na tela o número gerado e 
		que ele é um número ímpar.*/
		inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro n1, n2, random, maiorN, menorN

		escreva("Informe o primeiro número: ")
		leia(n1)
		escreva("Informe o segundo número: ")
		leia(n2)

		se (n1<n2) {
			escreva(" O número menor é: " + n1)
			escreva("\n O número maior é: " + n2)
		} senao {
			escreva(" O número menor é: " + n2)
			escreva("\n O número maior é: " + n1)
		}

		se (n1<n2) {
			maiorN = n2
			menorN = n1
		} senao {
			maiorN = n1
			menorN = n2
		}
		random = Util.sorteia(menorN, maiorN)
		escreva("\n O número sortiado foi: ", random)

		se (random < 0) {
			escreva("\n " + random + " é ímpar")
		} senao {
			escreva("\n " + random + " é par")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 963; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */