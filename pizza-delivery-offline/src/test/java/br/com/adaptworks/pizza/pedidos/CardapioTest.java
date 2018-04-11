package br.com.adaptworks.pizza.pedidos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.adaptworks.pizza.Cardapio;

public class CardapioTest {
	
	private Cardapio cardapio;
	
	@Before
	public void setup() {
		cardapio = new Cardapio();
	}

	@Test
	public void adicionaProduto() {
		cardapio.add("Pizza Portuguesa", 10.0);
		
		assertEquals(1, cardapio.totalProdutos());
	}
	
	@Test
	public void adiciona2Produtos() {
		cardapio.add("Pizza Portuguesa", 10.0);
		cardapio.add("Pizza Calabresa", 15.0);
		
		assertEquals(2, cardapio.totalProdutos());
	}
	
	@Test
	public void adicionaProdutoRepetido() {
		cardapio.add("Pizza Portuguesa", 10.0);
		cardapio.add("Pizza Calabresa", 15.0);
		cardapio.add("Pizza Calabresa", 15.0);
		
		assertEquals(2, cardapio.totalProdutos());
	}
	
	@Test
	public void listarCardapio() {
		cardapio.add("Pizza Portuguesa", 10.0);
		cardapio.add("Pizza Calabresa", 15.0);
		cardapio.add("Pizza Atum", 25.0);
		
		String lista = "Pizza Portuguesa\t-\tR$ 10.0\n"
						+ "Pizza Calabresa\t-\tR$ 15.0\n"
						+ "Pizza Atum\t-\tR$ 25.0\n";
		
		assertEquals(lista, cardapio.listar());
	}
	
	@Test
	public void existeProduto() {
		cardapio.add("Pizza Portuguesa", 10.0);
		cardapio.add("Pizza Calabresa", 15.0);
		cardapio.add("Pizza Atum", 25.0);
		
		assertTrue(cardapio.existe("Pizza Portuguesa"));
	}
	
	@Test
	public void naoExisteProduto() {
		cardapio.add("Pizza Portuguesa", 10.0);
		cardapio.add("Pizza Calabresa", 15.0);
		cardapio.add("Pizza Atum", 25.0);
		
		assertFalse(cardapio.existe("Pizza Margherita"));
	}
}
