package JavaLacoDecisao;

import java.util.Scanner;

public class LacoDecisao2 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		Scanner ler=new Scanner (System.in);
		
		System.out.printf("\nDigite o primeiro valor: ");
		n1=ler.nextInt();
		System.out.printf("\nDigite o segundo valor: ");
		n2=ler.nextInt();
		System.out.printf("\nDigite o terceiro valor: ");
		n3=ler.nextInt();
		
		if(n1<=n2 && n2<=n3)
		{
			System.out.printf("\nOrdem crescente: "+n1+", "+n2+", "+n3);
		}
		else if(n1<=n3 && n3<=n2)
		{
			System.out.printf("\nOrdem crescente: "+n1+", "+n3+", "+n2);
		}
		else if(n2<=n1 && n1<=n3)
		{
			System.out.printf("\nOrdem crescente: "+n2+", "+n1+", "+n3);
		}
		else if(n2<=n3 && n3<=n1)
		{		System.out.printf("\nOrdem crescente: "+n2+", "+n3+", "+n1);
		}
		else if(n3<=n1 && n1<=n2)
		{
			System.out.printf("\nOrdem crescente: "+n3+", "+n1+", "+n2);
		}
		else
		{
			System.out.printf("\nOrdem crescente: "+n3+", "+n2+", "+n1);
		}
		}
		
	}

