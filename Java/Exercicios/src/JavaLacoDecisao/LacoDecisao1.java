package JavaLacoDecisao;

import java.util.Scanner;

public class LacoDecisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,num3;
		Scanner ler=new Scanner (System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		num1=ler.nextInt();
		System.out.println("\nDigite o segundo número: ");
		num2=ler.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		num3=ler.nextInt();
		
		if(num1>num2 && num2>num3)
		{
			System.out.println("\nO maior número informado foi: "+num1);
		}
		else if(num2>num1 && num1>num3)
		{
			System.out.println("\nO maior número informado foi: "+num2);
		}
		else
		{
			System.out.println("\nO maior número informado foi: "+num3);
		}
	}
}
