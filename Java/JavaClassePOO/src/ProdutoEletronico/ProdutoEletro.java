package ProdutoEletronico;

import ProdutoEletronico.model.ProdutoEletronico;

public class ProdutoEletro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProdutoEletronico eletro = new ProdutoEletronico("Samsung", "Galaxy S21", "Com Tecnologia 5G e Processador Octa-Core! Um Smartphone Completo Para Você! Samsung Galaxy S21 FE 5G Com Câmera Tripla Traseira de 12MP e Bateria Interna de 4.500mAh.", 2.699);
		
		System.out.println("Nome da marca: "+eletro.getMarca());
		System.out.println("Modelo do aparelho: "+eletro.getModelo());
		System.out.println("Principais características do aparelho: "+eletro.getCaracteristica());
		System.out.println("Valor a partir de: "+eletro.getPreco());
		

	}

}
