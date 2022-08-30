package JavaRepeticoes;

import java.util.Scanner;

public class RepeticaoDOWHILE6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,soma=0,mult3=0;
		double media=0;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Para sair do programa, digite 0!");
		
		do
		{
			System.out.printf("\nDigite um número: ");
			num=ler.nextInt();
			
			if(num==0)
			{
				System.out.printf("\nAgradecemos por sua participação");
			}
			
			else
			{
				
			if(num %3 == 0)
			{
				soma+=num;
				mult3++;
			}
			}
				
				System.out.printf("\nDigite um número: ");
				num = ler.nextInt();
			}
		
		while(num != 0);
		
		if(mult3==0)
		{
			System.out.printf("\nNão é possível realizar divisão por zero!");
		}
		
		else
		{
			media=soma/mult3;
			System.out.printf("\nMédia dos números múltiplos de 3: "+media);
		}
	}
}