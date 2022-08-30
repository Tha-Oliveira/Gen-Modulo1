package JavaSequencial;

import java.util.Scanner;

public class Sequencial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int ano,mes,dia,soma,total,meses,atual;
		Scanner ler=new Scanner (System.in);
		
		System.out.printf("\nDigite seu nome: ");
		nome=ler.nextLine();
		System.out.printf("\nBem vindo(a) "+nome+"! Por favor, informe o ano de seu nascimento: ");
		ano=ler.nextInt();
		System.out.printf("\n"+nome+", agora informe o mês de seu nascimento (numeral): ");
		mes=ler.nextInt();
		System.out.printf("\nPor favor "+nome+", agora informe o dia de seu nascimento: ");
		dia=ler.nextInt();
		System.out.printf("\nPor fim, digite o mês em que estamos (numeral): ");
		atual=ler.nextInt();
		
		soma=(2022-ano);
		meses=(atual-mes);
		total=(soma*365)+(30-dia)+(meses*30);
		
		System.out.printf("\nSua idade é: "+soma+" anos");
		System.out.printf("\n"+nome+", a sua idade em dias, é de aproximadamente: "+total+" dias");	
		
	}

}
