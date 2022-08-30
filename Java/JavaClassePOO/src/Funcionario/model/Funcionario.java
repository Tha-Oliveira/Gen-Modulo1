package Funcionario.model;

public class Funcionario {
	
	private int id;
	private String nome;
	private String setor;
	private String cargo;
	private double salario;
	private float hora;
	
	public Funcionario(int id, String nome, String setor, String cargo, double salario, float hora) 
	{
		this.id = id;
		this.nome = nome;
		this.setor = setor;
		this.cargo = cargo;
		this.salario = salario;
		this.hora = hora;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getSetor() 
	{
		return setor;
	}

	public void setSetor(String setor) 
	{
		this.setor = setor;
	}

	public String getCargo() 
	{
		return cargo;
	}

	public void setCargo(String cargo) 
	{
		this.cargo = cargo;
	}

	public double getSalario() 
	{
		return salario;
	}

	public void setSalario(double salario) 
	{
		this.salario = salario;
	}

	public float getHora() 
	{
		return hora;
	}

	public void setHora(float hora) 
	{
		this.hora = hora;
	}
}
	
	