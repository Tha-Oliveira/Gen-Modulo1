package JavaRepeticoes;

import java.util.Scanner;

public class RepeticaoWHILE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,soma = 0,total = 0;
		
		Scanner ler=new Scanner (System.in);
		
		System.out.printf("\nDigite a sua idade: ");
		idade = ler.nextInt();
		
		while(idade <= 99)
		{
			if(idade <= 21)
			{
				idade = soma;
						soma++;
			}
			else if(idade>=50)
			{
				idade = total;
				total++;
			}
			
			System.out.printf("\nDigite a sua idade: ");
			idade = ler.nextInt();
		}
		System.out.printf("\nNúmero de pessoas com idade até 21 anos: %d",soma);
		System.out.printf("\nNúmero de pessoas com mais de 50 anos: %d",total);

}
}