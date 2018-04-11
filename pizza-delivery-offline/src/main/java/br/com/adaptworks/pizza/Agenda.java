package br.com.adaptworks.pizza;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

	private Map<String, Cliente> listagem;
	
	public Agenda() {
		listagem = new HashMap<String, Cliente>();
	}
	
	public boolean add(Cliente cliente) {
		if(listagem.get(cliente.getTelefone()) == null) {
			listagem.put(cliente.getTelefone(), cliente);
			return true;
		}
		
		return false;
	}

	public Cliente get(String telefone) {
		return listagem.get(telefone);
	}

}
