programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matriz[3][3],somaNum=0,linha,coluna,diag=0

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("Digite um número: ")
				leia(matriz[linha][coluna])

				somaNum+=matriz[linha][coluna]
			}
			escreva("\n")
		}

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva(matriz[linha][coluna]," ")
			}
			escreva("\n")
		}
		
		
		Util.aguarde(1500)
		limpa()

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				se(linha==coluna)
				escreva(matriz[linha][coluna], " ")
				diag=matriz[0][0]+matriz[1][1]+matriz[2][2]
			}
		}

		escreva("\n")
		escreva("\nA soma total dos números foi de: ",somaNum)
		escreva("\nA soma da diagonal é de: ",diag)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 687; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 7, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */