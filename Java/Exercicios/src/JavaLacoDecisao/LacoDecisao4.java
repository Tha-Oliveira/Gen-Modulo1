package JavaLacoDecisao;

import java.util.Scanner;

public class LacoDecisao4 {

public static void main(String[] args) {
	
	int numero;
	Scanner leia=new Scanner (System.in);
	double resultado;
	
	System.out.println("\nDigite um número: ");
	numero=leia.nextInt();
	
	if(numero %2==0)
		{
		resultado=Math.sqrt(numero);
		}
	else
	{
		resultado=Math.pow(numero, 2);
	}
	
	System.out.printf("\nResultado= "+resultado);
}

}
