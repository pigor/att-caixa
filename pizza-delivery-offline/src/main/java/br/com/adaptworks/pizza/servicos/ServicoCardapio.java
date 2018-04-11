package br.com.adaptworks.pizza.servicos;

import br.com.adaptworks.pizza.Cardapio;

public class ServicoCardapio {

	private static Cardapio cardapio;
	
	public static String adicionar(String produto, Double valor) {
		if(cardapio == null) {
			cardapio = new Cardapio();
		}
		
		String resultado = "";
		if(cardapio.existe(produto)) {
			resultado = "Produto Atualizado!";
		} else {
			resultado = "Produto Adicionado!";
		}
		
		cardapio.add(produto, valor);
		
		return resultado;
	}
	
	public static String remover() {
		// TODO
		return null;
	}
	
	public static String listar() {
		// TODO
		return null;
	}

}
