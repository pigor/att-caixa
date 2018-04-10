package steps;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import br.com.adaptworks.triangulo.Triangulo;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TrianguloTabelaExemploStepsDefinition {

	// atributos criados para compartilhar os lados em todos os metodos
	Integer lado1, lado2, lado3;
	
	
	@Dado("^os tres campos de entrada$")
	public void os_tres_campos_de_entrada() throws Throwable {
	    Assert.assertTrue(true);
	}
	
	@Quando("^eu informo o lado1 com valor (\\d+)$")
	public void eu_informo_o_lado1_com_valor(int l1) throws Throwable {
	    lado1 = l1;
	}

	@E("^eu informo o lado2 com valor (\\d+)$")
	public void eu_informo_o_lado2_com_valor(int l2) throws Throwable {
	    lado2 = l2;
	}	

	@Quando("^eu informo o lado3 com valor (\\d+)$")
	public void eu_informo_o_lado3_com_valor(int l3) throws Throwable {
	    lado3 = l3;
	}
	
	@Entao("^exibe a mensagem \"([^\"]*)\"$")
	public void exibe_a_mensagem(String mensagem) throws Throwable {
		Triangulo triangulo = new Triangulo();
		String resultado = triangulo.calcularTipo(lado1, lado2, lado3);
	    assertEquals(mensagem, resultado);
	}
	
}
