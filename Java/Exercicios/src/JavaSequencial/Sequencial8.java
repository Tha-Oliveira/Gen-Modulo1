package JavaSequencial;

import java.util.Scanner;

public class Sequencial8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double porcdist=28.0,imposto=45,fab,cons;
		
		
		Scanner ler=new Scanner (System.in);
		
		System.out.printf("Digite o valor do carro: ");
		fab=ler.nextDouble();
		
		imposto=(imposto*fab)/100;
		porcdist=(porcdist*fab)/100;
		
		cons=fab+porcdist+imposto;
		
		System.out.printf("\nO custo do carro para o consumidor é de: "+cons);

	}

}
