programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro a,b,c
		real d
		
		escreva("\nEntre com o valor de A: ")
		leia(a)
		escreva("\nEntre com o valor de B: ")
		leia(b)
		escreva("\nEntre com o valor de C: ")
		leia(c)
		
		d=(mat.potencia((a+b),2.0)+mat.potencia((b+c),2.0))/2 //exercicio do R e S
		escreva("\nO valor de D é: ",d)mat.arredondar(d, 2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */