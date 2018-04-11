package br.com.adaptworks.pizza;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AgendaTest {

	private Agenda agenda;
	private Cliente cliente;
	
	@Before
	public void setup() {
		agenda = new Agenda();
		cliente = new Cliente("Paulo Igor", "92222-3333", "Rua Sem Saída, 123");
	}
	
	@Test
	public void adicionaCliente() {
		assertTrue(agenda.add(cliente));
	}
	
	@Test
	public void adicionaClienteRepetido() {
		agenda.add(cliente);
		
		assertFalse(agenda.add(cliente));
	}
	
	@Test
	public void recuperaCliente() {
		agenda.add(cliente);
		
		assertEquals(cliente, agenda.get(cliente.getTelefone()));
	}
}
