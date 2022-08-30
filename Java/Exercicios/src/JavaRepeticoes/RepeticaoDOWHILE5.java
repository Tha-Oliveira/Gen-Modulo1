package JavaRepeticoes;

import java.util.Scanner;

public class RepeticaoDOWHILE5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,soma=0;
		Scanner ler=new Scanner (System.in);
		
		do
		{
			System.out.printf("Digite um número: ");
			num=ler.nextInt();
			
			soma+=num;
		}
		
		while(num!=0);
		
		System.out.printf("\nA soma de todos os números foi de: "+soma);

	}

}
