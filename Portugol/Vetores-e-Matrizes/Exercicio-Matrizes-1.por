programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		real n1[4][6],n2[4][6],m1[4][6],m2[4][6]
		inteiro linha, coluna

		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				escreva("\nEntre com um valor: ")
				leia(n1[linha][coluna])
				escreva("\nEntre com um valor: ")
				leia(n2[linha][coluna])

				m1[linha][coluna]=n1[linha][coluna]+n2[linha][coluna]
				m2[linha][coluna]=n1[linha][coluna]-n2[linha][coluna]

				limpa()
			}
		}

			para(linha=0;linha<4;linha++)
			{
				para(coluna=0;coluna<6;coluna++)
				{
					escreva("\nO valor de m1 é: ",m1[linha][coluna])
					escreva("\nO valor de m2 é: ",m2[linha][coluna])
				}
			}
		}
		
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 7, 7, 2}-{n2, 7, 16, 2}-{m1, 7, 25, 2}-{m2, 7, 34, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */