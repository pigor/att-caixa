package br.com.adaptworks.pizza;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void descricao() {
		Cliente cliente = new Cliente("Paulo Igor", "92222-3333", "Rua Sem Saída, 123");
		
		assertEquals("Paulo Igor (92222-3333) - Rua Sem Saída, 123\n", cliente.toString());
	}

}
