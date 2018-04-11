package br.com.adaptworks.integracao.pizza.pedidos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import br.com.adaptworks.pizza.servicos.ServicoCardapio;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ServicoCardapioSteps {

	String produto;
	Double valor;
	
	@Dado("^que eu tenho um novo produto para adicionar ao cardapio$")
	public void que_eu_tenho_um_novo_produto_para_adicionar_ao_cardapio() throws Throwable {
		assertTrue(true);
	}

	@Quando("^eu informo a descricao \"([^\"]*)\"$")
	public void eu_informo_a_descricao(String arg1) throws Throwable {
		produto = arg1;
	}

	@E("^informo o valor \"([^\"]*)\"$")
	public void informo_o_valor(String arg1) throws Throwable {
		valor = new Double(arg1);
	}
	
	@Entao("^apresenta mensagem \"([^\"]*)\"$")
	public void apresenta_mensagem(String arg1) throws Throwable {
		assertEquals(arg1, ServicoCardapio.adicionar(produto, valor));
	}
}
