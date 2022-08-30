package Paciente;

import Paciente.model.Paciente;

public class PacienteClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente info = new Paciente("Maycon Rocha", "123.456.789.00", "Bradesco Saúde", "Dor na barriga do lado esquerdo", "Le Forte");
		
		System.out.println("Nome do Paciente: "+info.getNome());
		System.out.println("CPF do Paciente: "+info.getCpf());
		System.out.println("Convênio Médico do Paciente: "+info.getConvenio());
		System.out.println("Paciente chegou com o seguinte sintoma: "+info.getSintoma());
		System.out.println("Paciente foi ao Hospital "+info.getHospital());

	}

}
