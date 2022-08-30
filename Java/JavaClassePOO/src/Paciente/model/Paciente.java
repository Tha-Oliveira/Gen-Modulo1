package Paciente.model;

public class Paciente {
	
	private String nome;
	private String cpf;
	private String convenio;
	private String sintoma;
	private String hospital;
	
	public Paciente(String nome, String cpf, String convenio, String sintoma, String hospital) 
	{
		this.nome = nome;
		this.cpf = cpf;
		this.convenio = convenio;
		this.sintoma = sintoma;
		this.hospital = hospital;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public String getConvenio() 
	{
		return convenio;
	}

	public void setConvenio(String convenio) 
	{
		this.convenio = convenio;
	}

	public String getSintoma() 
	{
		return sintoma;
	}

	public void setSintoma(String sintoma) 
	{
		this.sintoma = sintoma;
	}

	public String getHospital() 
	{
		return hospital;
	}

	public void setHospital(String hospital) 
	{
		this.hospital = hospital;
	}
}
