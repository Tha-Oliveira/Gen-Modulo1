programa
{
	
	funcao inicio()
	{
		real tomate,multa,excesso

		escreva("\nDigite o peso do tomate: ")
		leia(tomate)

		se(tomate>50)
		{
			excesso=tomate-50
			multa=excesso*4
			escreva("\nO valor da multa é de R$ ",multa," reais")
		}
		senao
		{
		excesso=0.0
		multa=0.0
		escreva("\nNão há multa nesta pesagem")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */