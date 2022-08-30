programa
{
	
	funcao inicio()
	{
		inteiro seg,hora,min

		escreva("\nInsira aqui a duração da festa em segundos: ")
		leia(seg)

		hora=seg/3600
		min=(seg-(hora*3600))/60
		seg=seg%60

		escreva("\nA duração do evento em hora foi ",hora," horas, ",min," minutos e ",seg," segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 174; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */