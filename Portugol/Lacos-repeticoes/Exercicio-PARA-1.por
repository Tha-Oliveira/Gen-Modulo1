programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		real x,mediaFilho=0.0,salario=0.0,mediaSal=0.0,maiorSal=0.0,porcSal=0.0,totalSal=0.0,filhos=0.0,totalFilhos=0.0

		para(x=1.0;x<=20;x++)
		{
			escreva("\nQuantos filhos você tem: ")
			leia(filhos)
			escreva("Informe o valor de seu salário: ")
			leia(salario)

			totalSal+=salario
			totalFilhos+=filhos

			se(salario>maiorSal)
			{
				maiorSal=salario
			}
			se(salario<100)
			{
				porcSal++
			}
			escreva("\nAgradecemos pelas informações, seus dados foram computados")
			Util.aguarde(1300)
			limpa()
		}

		mediaFilho=totalFilhos/20
		mediaSal=totalSal/20

		escreva("\nA média de salário é de: ",mediaSal," reais")
		escreva("\nA média de filhos é de: ",mediaFilho)
		escreva("\nO maior salário é de: ",maiorSal," reais")
		escreva("\nO percentual de pessoas com salário até R$100,00 corresponde a: ",((porcSal)/20)*100," %")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 685; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */