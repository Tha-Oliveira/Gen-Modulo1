package patinete;

import patinete.model.Patinete;

public class PatineteClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patinete info = new Patinete("Bandeirante", 350, "Preto", "Médio");
		
		System.out.println("A marca do Patinete é: "+info.getMarca());
		System.out.println("O valor do patinete é a partir de R$ "+info.getValor());
		System.out.println("A cor da patinete é: "+info.getCor());
		System.out.println("O tamanho do patinete é: "+info.getTamanho());
	}

}
