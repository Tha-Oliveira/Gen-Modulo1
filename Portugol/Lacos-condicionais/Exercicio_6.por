programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("\nDigite a idade do nadador: ")
		leia(idade)

		se(idade>=5 e idade<=7)
		{
			escreva("\nEsse nadador está na categoria Infantil A")
		}
		senao se(idade>=8 e idade<=11)
		{
			escreva("\nEsse nadador está na categoria Infantil B")
		}
		senao se(idade>=12 e idade<=13)
		{
			escreva("\nEsse nadador está na categoria Juvenil A")
		}
		senao se(idade>=14 e idade<=17)
		{
			escreva("\nEsse nadador está na categoria Juvenil B")
		}
		senao se(idade>=18)
		{
			escreva("\nEsse nadador está na categotia Adulto")
		}
		senao
		{
			escreva("\nDigite uma idade válida (acima de 5 anos)")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 653; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */