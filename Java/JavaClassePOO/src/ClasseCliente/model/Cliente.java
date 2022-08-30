package ClasseCliente.model;

public class Cliente {
	
	private int id;
	private String nome;
	private String cpf;
	private String email;
	private int telefone;
	private String endereco;
	
	

	public Cliente(int id, String nome, String cpf, String email, int telefone, String endereco) 
	{
	
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
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

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public int getTelefone() 
	{
		return telefone;
	}

	public void setTelefone(int telefone) 
	{
		this.telefone = telefone;
	}

	public String getEndereco() 
	{
		return endereco;
	}

	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	public void visualizar()
	{
		System.out.println("**************************************************************************************");
		System.out.println("Informações do cliente");
		System.out.println("**************************************************************************************");
		System.out.println("\nID do Cliente: "+this.id);
		System.out.println("Nome do Cliente: "+this.nome);
		System.out.println("CPF do Cliente: "+this.cpf);
		System.out.println("E-mail do Cliente: "+this.email);
		System.out.println("Telefone do Cliente: "+this.telefone);
		System.out.println("Endereo do Cliente: "+this.endereco);
	}
}
