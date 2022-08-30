package Aviao.model;

public class ClasseAviao {
	
	private String empresa;
	private String modelo;
	private int numero;
	private String origem;
	private String destino;
	
	public void liga()
	{
	System.out.println("O avião está próximo de sua decolagem!");	
	}

	public ClasseAviao(String empresa, String modelo, int numero, String origem, String destino) 
	{
		this.empresa = empresa;
		this.modelo = modelo;
		this.numero = numero;
		this.origem = origem;
		this.destino = destino;
	}
	
	public String getEmpresa() 
	{
		return empresa;
	}

	public void setEmpresa(String empresa) 
	{
		this.empresa = empresa;
	}

	public String getModelo() 
	{
		return modelo;
	}

	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}

	public int getNumero() 
	{
		return numero;
	}

	public void setNumero(int numero) 
	{
		this.numero = numero;
	}

	public String getOrigem() 
	{
		return origem;
	}

	public void setOrigem(String origem) 
	{
		this.origem = origem;
	}

	public String getDestino() 
	{
		return destino;
	}

	public void setDestino(String destino) 
	{
		this.destino = destino;
	}

	public void visualizar()
	{
	}
	
}
