package br.com.adaptworks.pizza.pedido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.adaptworks.pizza.Cardapio;
import br.com.adaptworks.pizza.Cliente;

public class Pedido {
	
	private Cliente cliente;
	private Cardapio cardapio;
	
	private List<String> produtos;
	private HashMap<String, Double> pedidos;

	public Pedido(Cliente cliente, Cardapio cardapio) {
		this.cliente = cliente;
		this.cardapio = cardapio;
		pedidos = new HashMap<String, Double>();
		produtos = new ArrayList<String>();
	}

	public boolean add(String produto, Double valor) {
		if(cardapio.existe(produto)) {
			produtos.add(produto);
			pedidos.put(produto, valor);
			
			return true;
		} else {
			return false;
		}
	}

	public String enviar() {
		return cliente.toString() + listar();
	}
	
	private String listar() {
		String lista = "";
		for (String produto : produtos) {
			lista += "\n\t" + produto + " - R$ " + pedidos.get(produto).toString();
		}
		
		return lista;
	}

	public Double valorTotal() {
		Double total = 0.0;
		for (String produto : produtos) {
			total += pedidos.get(produto);
		}
		
		return total;
	}

}
