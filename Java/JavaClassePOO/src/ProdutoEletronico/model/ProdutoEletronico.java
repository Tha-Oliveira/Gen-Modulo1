package ProdutoEletronico.model;

public class ProdutoEletronico {
	
	private String marca;
	private String modelo;
	private String caracteristica;
	private double preco;
	public ProdutoEletronico(String marca, String modelo, String caracteristica, double preco) 
	{
		this.marca = marca;
		this.modelo = modelo;
		this.caracteristica = caracteristica;
		this.preco = preco;
	}
	public String getMarca() 
	{
		return marca;
	}
	public void setMarca(String marca) 
	{
		this.marca = marca;
	}
	public String getModelo() 
	{
		return modelo;
	}
	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}
	public String getCaracteristica() 
	{
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) 
	{
		this.caracteristica = caracteristica;
	}
	public double getPreco() 
	{
		return preco;
	}
	public void setPreco(float preco) 
	{
		this.preco = preco;
	}
	
	
	
	

}
