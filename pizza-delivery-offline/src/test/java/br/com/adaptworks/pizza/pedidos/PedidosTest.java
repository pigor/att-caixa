package br.com.adaptworks.pizza.pedidos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import br.com.adaptworks.pizza.Cardapio;
import br.com.adaptworks.pizza.Cliente;
import br.com.adaptworks.pizza.pedido.Pedido;

public class PedidosTest {
	
	private Pedido pedido;
	
	private Cliente cliente;
	
	private Cardapio cardapio;
	
	@Before
	public void setup() {
		cardapio = new Cardapio();
		cardapio.add("Pizza Portuguesa", 10.0);
		cardapio.add("Pizza Calabresa", 15.0);
		cardapio.add("Pizza Atum", 25.0);
		
		cliente = mock(Cliente.class);
		when(cliente.toString()).thenReturn("Paulo Igor (92222-3333) - Rua Sem Saída, 123");

		pedido = new Pedido(cliente, cardapio);
	}

	@Test
	public void recebePedidoDe1Pizza() {
		pedido.add("Pizza Portuguesa", 10.0);
		
		String pedidoRecebido = cliente.toString() +"\n\tPizza Portuguesa - R$ 10.0";
		
		assertEquals(pedidoRecebido, pedido.enviar());
	}
	
	@Test
	public void recebePedidoDe2Pizza() {
		pedido.add("Pizza Portuguesa", 10.0);
		pedido.add("Pizza Calabresa", 15.0);
		
		String pedidoRecebido = cliente.toString() + "\n\tPizza Portuguesa - R$ 10.0"
											 + "\n\tPizza Calabresa - R$ 15.0";
		
		assertEquals(pedidoRecebido, pedido.enviar());
	}
	
	@Test
	public void recebePedidoDe3Pizza() {
		pedido.add("Pizza Portuguesa", 10.0);
		pedido.add("Pizza Calabresa", 15.0);
		pedido.add("Pizza Atum", 25.0);
		
		String pedidoRecebido = cliente.toString() + "\n\tPizza Portuguesa - R$ 10.0"
											 + "\n\tPizza Calabresa - R$ 15.0"
											 + "\n\tPizza Atum - R$ 25.0";
		
		assertEquals(pedidoRecebido, pedido.enviar());
	}
	
	@Test
	public void valorTotalPedido() {
		pedido.add("Pizza Portuguesa", 10.0);
		pedido.add("Pizza Calabresa", 15.0);
		pedido.add("Pizza Atum", 25.0);
		
		Double valorTotal = 10.0 + 15.0 + 25.0;
		
		assertEquals(valorTotal, pedido.valorTotal());
	}
	
	@Test
	public void pedidoForaDoCardapio() {
		assertFalse(pedido.add("Pizza Margherita", 25.0));
	}
}
