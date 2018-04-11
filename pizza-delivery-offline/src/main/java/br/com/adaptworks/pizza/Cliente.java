package br.com.adaptworks.pizza;

public class Cliente {
	
	private String nome;
	private String telefone;
	private String endereco;

	public Cliente(String nome, String telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public String toString() {
		return nome + " ("+ telefone +") - "
				+ endereco + "\n";
	}

}
