package ClasseCliente;

import ClasseCliente.model.Cliente;

public class ClasseCliente {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente dados = new Cliente(123, "Thais Oliveira", "123.456.789-00", "thaoliveira@gmail.com", 955332211, "Rua dos Devs 7070");
		
		dados.visualizar();
		
		System.out.println("\n");
		
		System.out.println("Número de Identificação do(a) Cliente: "+dados.getId());
		System.out.println("Nome do(a) Cliente: "+dados.getNome());
		System.out.println("CPF do(a) Cliente: "+dados.getCpf());
		System.out.println("E-mail do(a) Cliente: "+dados.getEmail());
		System.out.println("Telefone do(a) cliente: "+dados.getTelefone());
		System.out.println("Endereço do(a) Cliente: "+dados.getEndereco());
	}

}
