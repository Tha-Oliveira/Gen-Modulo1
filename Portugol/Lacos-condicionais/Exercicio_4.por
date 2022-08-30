programa
{
	
	funcao inicio()
	{
		inteiro num

		escreva("Entre com um número: ")
		leia(num)

		se(num %2==0 e num>0)
		{
			escreva("\nÉ um número par e positivo")
		}
		senao se(num %2==0 e num<0)
		{
			escreva("\nÉ um número par e negativo")
		}
		se(num %2!=0 e num>0)
		{
			escreva("\nÉ um número impar e positivo")
		}
		senao se(num %2!=0 e num<0)
		{
			escreva("\nÉ um número impar e negativo")
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 204; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */