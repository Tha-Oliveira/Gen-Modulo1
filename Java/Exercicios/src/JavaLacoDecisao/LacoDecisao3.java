package JavaLacoDecisao;

import java.util.Scanner;

public class LacoDecisao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		String nome;
		Scanner leia=new Scanner(System.in);
		
		
		System.out.printf("\nDigite sua idade: ");
		idade=leia.nextInt();
		leia.nextLine();
		System.out.printf("\nDigite seu nome: ");
		nome=leia.nextLine();
		
		if(idade>=10 && idade<=14)
		{
			System.out.printf("\n"+nome+", você está na categoria Infantil.");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.printf("\n"+nome+", você está na categoria Juvenil.");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.printf("\n"+nome+", você está na categoria Adulto.");
		}
		else
		{
			System.out.printf("\nPor favor digite uma opção válida.");
		}

	}

}
