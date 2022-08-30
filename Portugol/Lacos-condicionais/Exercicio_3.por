programa
{
	
	funcao inicio()
	{
		inteiro n1,n2,n3,n4,r1,r2,r3,r4

		escreva("\nDigite um número: ")
		leia(n1)
		escreva("Digite um número: ")
		leia(n2)
		escreva("Digite um número: ")
		leia(n3)
		escreva("Digite um número: ")
		leia(n4)

		r1=n1*n1
		r2=n2*n2
		r3=n3*n3
		r4=n4*n4

		se(r3>=1000)
		{
			escreva("\nO valor de ",n3," ao quadrado foi de: ",r3)
		}
		senao
		{
			escreva("\nO valor de ",n1," ao quadrado foi de: ",r1)
			escreva("\nO valor de ",n2," ao quadrado foi de: ",r2)
			escreva("\nO valor de ",n3," ao quadrado foi de: ",r3)
			escreva("\nO valor de ",n4," ao quadrado foi de: ",r4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 572; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */