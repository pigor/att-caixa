package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import br.com.adaptworks.triangulo.Triangulo;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TrianguloSimplesStepsDefinition {

	// atributos criados para compartilhar os lados em todos os metodos
	Integer lado1, lado2, lado3;
	
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
		
		/*
		 * Pega os tres lados que estao nesta classe e associa com os
		 * lados que vem da TrianguloSimples.feature (arg1 em cada @Quando)
		 * e usa para calcular o triangulo
		 */
		assertEquals(arg1, new Triangulo().calcularTipo(lado1, lado2, lado3));
	}
}
