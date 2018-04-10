package br.com.adaptworks.triangulo.integracao.simples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import br.com.adaptworks.triangulo.Triangulo;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TrianguloSimplesStepsDefinition {
	
	int lado1, lado2, lado3;
	
	@Dado("^que eu estou na pagina de consulta de triangulo$")
	public void que_eu_estou_na_pagina_de_consulta_de_triangulo() throws Throwable {
	    assertTrue(true);
	}

	@Quando("^eu preencho o lado1 com \"([^\"]*)\"$")
	public void eu_preencho_o_lado1_com(int arg1) throws Throwable {
	    lado1 = arg1;
	}
	
	@E("^eu preencho o lado2 com \"([^\"]*)\"$")
	public void eu_preencho_o_lado2_com(int arg1) throws Throwable {
	    lado2 = arg1;
	}
	
	@E("^eu preencho o lado3 com \"([^\"]*)\"$")
	public void eu_preencho_o_lado3_com(int arg1) throws Throwable {
	    lado3 = arg1;
	}

	@Entao("^apresenta mensagem \"([^\"]*)\"$")
	public void apresenta_mensagem(String arg1) throws Throwable {
		String mensagem = new Triangulo().calcularTipo(lado1, lado2, lado3);
		
		assertEquals(arg1, mensagem);
	}
}
