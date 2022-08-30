package JavaRepeticoes;

import java.util.Scanner;

public class RepeticaoFOR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,x;
		
		Scanner ler=new Scanner (System.in);
		
		
		for(x=1;x<=10;x++)
		{
			System.out.printf("\nDigite um número: ");
			num=ler.nextInt();
			
			if(num%2==0)
			{
				System.out.printf("\nO número %d é par",num);
			}
			else
			{
				System.out.printf("\nO número %d é ímpar",num);
			}
		}

	}

}