programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro numero[10],soma=0,maiorpont=0,maior=0,contmaior=0,x
		real media

		para(x=0;x<10;x++)
		{
			escreva("\nLançamentos: ")
			leia(numero[x])
			se(numero[x]>6)
			{
				pare
			}
			soma+=numero[x]

			se(numero[x]==6)
			{
			maiorpont++
			}
			se(maior<=numero[x])
			{
				maior=numero[x]
			}
		}
		para(x=0;x<10;x++)
		{
			se(maior==numero[x])
			{
				contmaior++
			}
		}
		media=soma/10
		escreva("\nA média Aritmética foi de: ",media)
		escreva("\nQuantidade de vezes em que o 6 foi o maior: ",maiorpont)
		escreva("\nQuantidade de vezes em que outros nº foram maior: ",contmaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 7, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */