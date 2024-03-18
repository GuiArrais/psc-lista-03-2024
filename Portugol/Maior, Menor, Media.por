programa
{		/*Escreva um algoritmo que leia 3 números a partir do teclado. 
		O algoritmo deve apresentar:
		a. O maior número.
		b. O menor número.
		c. A média aritmética dos três números.*/
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real A, B, C, media
		real arredonda
		
		escreva("Digite o primeiro número: ")
		leia(A)

		escreva("\n Digite o segundo número: ")
		leia(B)

		escreva("\n Digite o terceiro número: ")
		leia(C)
		
		se (A > B e A > C) {
			escreva("\n O número maior é: ", A)
		} senao se (B > A e B > C) {
			escreva("\n O número maior é: " , B)
		} senao
			escreva("\n O número maior é: ", C)

		se (A < B e A < C) {
			escreva("\n O número menor é: ", A)
		} senao se (B < A e B < C) {
			escreva("\n O número menor é: ", B)
		} senao
			escreva("\n O número menor é: ", C)

		media = (A + B + C) / 3
		arredonda = mat.arredondar(media, 2)
			escreva("\n A média aritmética é: ", arredonda)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 625; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */