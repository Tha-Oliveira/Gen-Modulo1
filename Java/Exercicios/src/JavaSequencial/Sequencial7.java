package JavaSequencial;

import java.util.Scanner;

public class Sequencial7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a,b,c,d,e,f,x,y;
		
		Scanner ler=new Scanner (System.in);
		
		System.out.printf("Digite o valor de A: ");
		a=ler.nextFloat();
		System.out.printf("\nDigite o valor de B: ");
		b=ler.nextFloat();
		System.out.printf("\nDigite o valor de C: ");
		c=ler.nextFloat();
		System.out.printf("\nDigite o valor de D: ");
		d=ler.nextFloat();
		System.out.printf("\nDigite o Valor de E: ");
		e=ler.nextFloat();
		System.out.printf("\nDigite o valor de F: ");
		f=ler.nextFloat();
		System.out.printf("\nDigite o valor de X: ");
		x=ler.nextFloat();
		System.out.printf("\nDigite o valor de Y: ");
		y=ler.nextFloat();
		
		x=(c*e)-(b*f)/(a*e)-(b*d);
		y=(a*f)-(c*d)/(a*e)-(b*d);
		
		System.out.printf("\nO valor de X corresponde a: "+x);
		System.out.printf("\nO valor de Y corresponde a: "+y);

	}

}
