package JavaSequencial;

import java.util.Scanner;

public class Sequencial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int dias,ano,mes;
		Scanner ler=new Scanner (System.in);
		
		System.out.printf("\nDigite seu nome: ");
		nome=ler.nextLine();
		System.out.printf("\nSeja bem vindo(a) "+nome+". Digite a sua idade em dias: ");
		dias=ler.nextInt();
		
		ano=dias/365;
		mes=(dias%365)/30;
		dias=(dias%365)/30;
		
		System.out.printf("\n"+nome+", sua idade representada em anos é de: "+ano+". Em meses é de: "+mes+". Em dias é de: "+dias+".");
		
	}

}
