package JavaRepeticoes;

import java.util.Scanner;

public class RepeticaoWhile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x=1,idade,genero,fatorpsico,pessoacalma=0,mulherNerv=0,homemAgre=0,neutroCalm=0,pesuNerv40=0,pesuCalm18=0;
		
		Scanner ler = new Scanner (System.in);
		
		while(x<=150)
		{
			System.out.printf("Digite a sua idade: ");
			idade=ler.nextInt();
			System.out.printf("Digite seu gênero: \n1 - Feminino \n2 - Masculino \n3 - Neutro");
			genero=ler.nextInt();
			System.out.printf("Entre com o fator psicológico: \n1 - Calma \n2 - Nervosa \n3 - Agressivo");
			fatorpsico=ler.nextInt();
			
			if(fatorpsico==1)
			{
				pessoacalma++;
			}
			if(genero==1 && fatorpsico==2)
			{
				mulherNerv++;
			}
			if(genero==2 && fatorpsico==3)
			{
				homemAgre++;
			}
			if(genero==3 && fatorpsico==1)
			{
				neutroCalm++;
			}
			if(fatorpsico==2 && idade>40)
			{
				pesuNerv40++;
			}
			if(fatorpsico==1 && idade<18)
			{
				pesuCalm18++;
			}
			
			x++;
		}
		
		System.out.printf("\nNúmero de pessoas calmas: "+pessoacalma);
		System.out.printf("\nNúmero de mulheres nervosas: "+mulherNerv);
		System.out.printf("\nNúmero de homens agressivos: "+homemAgre);
		System.out.printf("\nNúmero de pessoas neutras calmas: "+neutroCalm);
		System.out.printf("\nNúmero de pessoas nervosas com mais de 40 anos: "+pesuNerv40);
		System.out.printf("\nNúmero de pessoas calmas com menos de 18 anos: "+pesuCalm18);
		
	}

}