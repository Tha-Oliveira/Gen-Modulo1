package Conta;

import Conta.model.Conta;

public class ContaBanc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c1 = new Conta(123456, "123", "CC", "João da Silva", 2000.0f);
		c1.visualizar();
		Conta c2 = new Conta(123457, "123", "CC", "Amanda", 200000.0f);
		c2.visualizar();
		
		System.out.println("Saldo da Conta c1: "+c1.getSaldo());
		c1.setSaldo(3000.0f);
		System.out.println("Saldo atualizado da Conta c1: "+c1.getSaldo());
		System.out.println("\n");
		
		System.out.println("\nSaldo da Conta c2: "+c2.getSaldo());
		c2.setTitular("Amanda Giacometti");
		System.out.println("Nome do Titular atualizado da Conta c2: "+c2.getTitular());
		
		if (c2.Sacar(250000.0f) == true)
			c2.visualizar();
			else
				System.out.println("\n"+ "Saldo Insuficiente");
		System.out.println("\n");
		
		Conta c3 = new Conta();
		c3.visualizar();
		
		c3.setNumero(123458);
		c3.setTitular("Gabi");
		c3.setSaldo(500000.0f);
		c3.visualizar();
	}

}
