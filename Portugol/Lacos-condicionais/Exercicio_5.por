programa
{
	
	funcao inicio()
	{
		real polu // indice de poluição

		escreva("\nDigite o Índice de Poluição: ")
		leia(polu)

		se(polu>=0.3 e polu<0.4)
		{
			escreva("\nCom o índice de poluição em ",polu," solicitamos que as industrias do 1º grupo, suspendam suas atividades\n")
		}
		senao se(polu>=0.4 e polu<0.5)
		{
			escreva("\nCom o índice de poluição em ",polu," solicitamos que as industrias do 1º e 2º grupo, suspendam suas atividades\n")
		}
		senao se(polu>=0.5)
		{
			escreva("\nCom o índice de poluição em ",polu," solicitamos que TODAS as industrias, suspendam suas atividades\n")
		}
		senao
		{
			escreva("\nParabéns, seu grupo está dentro do índice de poluição permitido\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 454; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */