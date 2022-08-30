package JavaSequencial;

import java.util.Scanner;

public class Sequencial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seg,hora,min;
		Scanner ler=new Scanner (System.in);
		
		System.out.printf("\nInsira aqui a duração da festa em segundos: ");
		seg=ler.nextInt();
		
		hora=seg/3600;
		min=(seg-(hora*3600))/60;
		seg=seg%60;
		
		System.out.printf("\nA duração do evento foi de: "+hora+" horas,"+min+" minutos e "+seg+" segundos.");
	}

}
