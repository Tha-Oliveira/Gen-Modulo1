package JavaSequencial;

import java.util.Scanner;

public class Sequencial4 {
	
	public static void main(String[] args) {
		
		int a,b,c;
		double d;
		
		Scanner ler=new Scanner (System.in);
		
		System.out.printf("\nDigite o valor de A: ");
		a=ler.nextInt();
		System.out.printf("\nDigite o valor de B: ");
		b=ler.nextInt();
		System.out.printf("\nDigite o valor de C: ");
		c=ler.nextInt();
		
		d=(Math.pow((a+b), 2)+Math.pow((b+c), 2))/2;
		System.out.printf("\nO valor de D é: "+d);
}
}