package br.com.adaptworks.triangulo.integracao.tabela;

import java.util.List;

import br.com.adaptworks.triangulo.Triangulo;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import static org.junit.Assert.*;

public class TrianguloTabelaStepsDefinition {

	// atributos criados para compartilhar os lados em todos os metodos
	Integer lado1, lado2, lado3;
	List<LadosTriangulo> lados;

	@Dado("^que eu estou na pagina de consulta de triangulo$")
	public void que_eu_estou_na_pagina_de_consulta_de_triangulo() throws Throwable {
		assertTrue(true);
	}

	@Quando("^eu preencho os seguintes lados$")
	public void eu_preencho_os_seguintes_lados(List<LadosTriangulo> lados) throws Throwable {
		this.lados = lados;
	}

	@Entao("^apresenta mensagem \"([^\"]*)\"$")
	public void apresenta_mensagem(String arg1) throws Throwable {
		/*
		 * Para que possamos utilizar todos os registros da tabela e necessario
		 * efetuar um for each nos lados do triangulo.
		 * A execucao desta classe sera igual a quantidade de dados que existir na tabela
		 */
		for (LadosTriangulo ladosTriangulo : lados) {
			lado1 = ladosTriangulo.lado1;
			lado2 = ladosTriangulo.lado2;
			lado3 = ladosTriangulo.lado3;

			assertEquals(arg1, new Triangulo().calcularTipo(lado1, lado2, lado3));
		}
	}

	/**
	 * Classe representado os lados do triangulo para utilizar na tabela
	 */
	class LadosTriangulo {
		Integer lado1, lado2, lado3;
	}
}
