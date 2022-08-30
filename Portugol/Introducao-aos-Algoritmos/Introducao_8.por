programa
{
	
	funcao inicio()
	{
		real porcdist=28.0,imposto=45.0,fab,cons

		escreva("Digite o valor do carro: ")
		leia(fab)

		imposto=(imposto*fab)/100
		porcdist=(porcdist*fab)/100
		
		cons=fab+porcdist+imposto
 	 	
		escreva("\nO custo do carro para o consumidor é de: ",cons)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 227; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {porcdist, 6, 7, 8}-{imposto, 6, 21, 7}-{fab, 6, 34, 3}-{cons, 6, 38, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */