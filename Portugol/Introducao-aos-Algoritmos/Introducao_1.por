programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro ano,mes,dia,soma,total,meses,atual

		escreva("Entre com seu nome: ")
		leia(nome)
		escreva("Bem vindo(a) ",nome,"! Por favor, informe o ano de seu nascimento: ")
		leia(ano)
		escreva(nome,", agora informe o mês de seu nascimento (numeral): ")
		leia(mes)
		escreva("Por favor, ",nome,", agora informe o dia do seu nascimento: ")
		leia(dia)
		escreva("Por fim, digite o mês em que estamos (numeral): ")
		leia(atual)
		soma=(2022-ano)
		meses=(atual-mes)
		escreva("Sua idade é: ",soma," anos\n")
		total=(soma*365)+(30-dia)+(meses*30)
		escreva(nome," , a sua idade em dias, é de aproximadademente: ",total," dias")
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 35; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */