programa
{
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
		Discriminante: delta = b² – 4ac*/

		inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real a, b, c, delta, x1, x2, equac1grau, arredonda1, arredonda2

		escreva("ax² + bx + c = 0")
		escreva("\nInforme o valor de 'a': ")
		leia(a)

		escreva("Informe o valor de 'b': ")
		leia(b)

		escreva("Informe o valor de 'c': ")
		leia(c)

		delta = (b*b) - (4*a*c)
		x1 = (-b + mat.raiz(delta, 2)) / (2 * a)
		x2 = (-b - mat.raiz(delta, 2)) / (2 * a)
		arredonda1 = mat.arredondar(x1, 2)
		arredonda2 = mat.arredondar(x2, 2)


		se (a == 0 e b == 0 e c != 0) {
			escreva("\n Coeficientes informados incorretamente")
		} 
		//Equação de 1° grau
		senao se (a == 0 e b != 0) {
			escreva("\n Essa é uma equação de primeiro grau")
		equac1grau = (c / b)
		escreva("\n O valor da raiz real da equação é: ", equac1grau)
		}
		
		//Delta negativo
		senao se (delta < 0) {
			escreva("\n Esta equação não possui raízes reais")	
		}
		//Delta igual a 0
		senao se (delta == 0) {
			escreva("\n Esta equação possui duas raízes reais iguais")
		  	escreva("\n O valor da primeira raiz é: ", arredonda1)
		  	escreva("\n O valor da segunda raiz é: ", arredonda2)
		}
		//Delta > 0
		senao se (delta > 0) {
			escreva("\n Esta equação possui duas raízes reais diferentes")
		x1 = (-b + mat.raiz(delta, 2)) / (2 * a)
		x2 = (-b - mat.raiz(delta, 2)) / (2 * a)
		  	escreva("\n O valor da primeira raiz é: ", arredonda1)
		  	escreva("\n O valor da segunda raiz é: ", arredonda2)
		}  	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1066; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */