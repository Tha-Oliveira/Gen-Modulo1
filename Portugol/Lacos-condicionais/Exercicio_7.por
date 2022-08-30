programa
{
	
	funcao inicio()
	{
		inteiro base,altura,area

		escreva("\nDigite a base do triângulo: ")
		leia(base)
		escreva("\nDigite a altura do triângulo: ")
		leia(altura)

		se(base>=0 e altura>=0)
		{
			area=base*altura/2
			escreva("\nO valor da área do triângulo foi de: ",area)
		}
		senao
		escreva("\nPor favor, digite um número válido")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */