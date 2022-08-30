package patinete.model;

public class Patinete {
	
	private String marca;
	private int valor;
	private String cor;
	private String tamanho;
	
	public Patinete(String marca, int valor, String cor, String tamanho) 
	{
		this.marca = marca;
		this.valor = valor;
		this.cor = cor;
		this.tamanho = tamanho;
	}

	public String getMarca() 
	{
		return marca;
	}

	public void setMarca(String marca) 
	{
		this.marca = marca;
	}

	public int getValor() 
	{
		return valor;
	}

	public void setValor(int valor) 
	{
		this.valor = valor;
	}

	public String getCor() 
	{
		return cor;
	}

	public void setCor(String cor) 
	{
		this.cor = cor;
	}

	public String getTamanho() 
	{
		return tamanho;
	}

	public void setTamanho(String tamanho) 
	{
		this.tamanho = tamanho;
	}
	
	
	
	

}
