programa
{
	
	funcao inicio()
	{
	real pont[5],maiorpont=0.0
	inteiro x

	para(x=0;x<5;x++)
	{
		escreva("Digite a ",x+1,"ª pontuação: ")
		leia(pont[x])

		se(pont[x]>maiorpont)
		{
			maiorpont=pont[x]
		}
	}
	escreva("\nA maior pontuação foi de: ",maiorpont," pontos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */