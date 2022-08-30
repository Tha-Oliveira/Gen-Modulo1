programa
{
	
	funcao inicio()
	{
		inteiro num,total=0,media=0,lidos=0
		
		escreva("\nDigite um número: ")
		leia(num)

		enquanto(num>=0)
		{
			lidos=lidos++
			total+=num
			media=total/lidos
			
			escreva("Digite um número: ")
			leia(num)
			
		}
		escreva("\nO valor total apresentado foi: ",total)
		escreva("\nQuanidades de números lidos: ",lidos)
		escreva("\nA média dos valores apresentados é: ",media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 73; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */