programa
{
	
	funcao inicio()
	{
		inteiro dias,ano,mes
		cadeia nome

		escreva("\nDigite seu nome: ")
		leia(nome)
		escreva("\nSeja bem vindo(a) ",nome,". Digite a sua idade em dias: ")
		leia(dias)

		ano=dias/365
		mes=(dias%365)/30
		dias=(dias%365)/30

		escreva(nome," Sua idade representada em anos é de ",ano,". Em meses é de ",mes,". Em dias é de ",dias,".")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 109; 
 * @PONTOS-DE-PARADA = 10;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */