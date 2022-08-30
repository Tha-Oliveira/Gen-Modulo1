package JavaSequencial;

import java.util.Scanner;

public class Sequencial5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media=0,p1,p2,p3;
		String nome;
		
		Scanner ler=new Scanner (System.in);
		
		System.out.printf("Digite o nome do(a) aluno(a): ");
		nome=ler.nextLine();
		System.out.printf("\nDigite a primeira nota: ");
		n1=ler.nextFloat();
		System.out.printf("\nDigite a segunda nota: ");
		n2=ler.nextFloat();
		System.out.printf("\nDigite a terceira nota: ");
		n3=ler.nextFloat();
		
		p1=n1*2;
		p2=n2*3;
		p3=n3*5;
		
		media=(p1+p2+p3)/3;
		
		System.out.printf("\nA média do aluno(a) "+nome+" foi de: "+media);

	}

}
