programa
{
	
	funcao inicio()
	{
		inteiro somaImpar,soma=0

		para(somaImpar=1;somaImpar<=500;somaImpar++)
		{
			se(somaImpar%2!=0 e somaImpar%3==0)
			{
				soma+=somaImpar
			}
		}
		escreva("\nA soma dos números Ímpares de 1 a 500 é: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 251; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */