package Funcionario;

import Funcionario.model.Funcionario;

public class FuncionarioClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Funcionario dados = new Funcionario(123, "João da Silva", "Suporte Técnico", "Analista", 4500, 35);
		
		System.out.println("ID do(a) funcionário(a): "+dados.getId());
		System.out.println("Nome do(a) funcionario(a): "+dados.getNome());
		System.out.println("Setor de trabalho: "+dados.getSetor());
		System.out.println("Cargo do(a) funcionário(a): "+dados.getCargo());
		System.out.println("Salário do(a) funcionário(a): "+dados.getSalario());
		System.out.println("Horas trabalhadas durante a semana: "+dados.getHora());

	}

}
