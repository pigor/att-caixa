package br.com.adaptworks.pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cardapio {
	
	private List<String> descricaoProdutos;
	private Map<String, Double> produtos;

	public Cardapio() {
		produtos = new HashMap<String, Double>();
		descricaoProdutos = new ArrayList<String>();
	}
	
	public void add(String produto, Double valor) {
		descricaoProdutos.add(produto);
		produtos.put(produto, valor);
	}

	public int totalProdutos() {
		return produtos.size();
	}
	
	public String listar() {
		String lista = "";
		
		for (String produto : descricaoProdutos) {
			lista += produto + "\t-\tR$ " + produtos.get(produto) + "\n";
		}
		
		return lista;
	}

	public boolean existe(String produto) {
		for (String descricao : descricaoProdutos) {
			if(produto.equals(descricao)) {
				return true;
			}
		}
		
		return false;
	}

}
