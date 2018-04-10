package br.com.adaptworks.triangulo.unidade;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.adaptworks.triangulo.Triangulo;

public class TrianguloTest {

	@Test
	public void trianguloEquilatero() {
		String mensagem = new Triangulo().calcularTipo(1, 1, 1);
		
		assertEquals("Triângulo Equilátero", mensagem);
	}
	
	@Test
	public void trianguloEquilatero2() {
		String mensagem = new Triangulo().calcularTipo(3, 3, 3);
		
		assertEquals("Triângulo Equilátero", mensagem);
	}
	
	@Test
	public void trianguloIsosceles() {
		String mensagem = new Triangulo().calcularTipo(3, 3, 5);
		
		assertEquals("Triângulo Isósceles", mensagem);
	}
	
	@Test
	public void trianguloIsosceles2() {
		String mensagem = new Triangulo().calcularTipo(3, 5, 3);
		
		assertEquals("Triângulo Isósceles", mensagem);
	}
	
	@Test
	public void trianguloIsosceles3() {
		String mensagem = new Triangulo().calcularTipo(5, 3, 3);
		
		assertEquals("Triângulo Isósceles", mensagem);
	}
	
	@Test
	public void trianguloEscaleno() {
		String mensagem = new Triangulo().calcularTipo(2, 3, 4);
		
		assertEquals("Triângulo Escaleno", mensagem);
	}
	
	@Test
	public void dadosInvalidos(){
		String mensagem = new Triangulo().calcularTipo(-1, 2, 3);
		assertEquals("", mensagem);
	}
	
	@Test
	public void valoresZero(){
		String mensagem = new Triangulo().calcularTipo(0, 0, 0);
		assertEquals("", mensagem);
	}
}
