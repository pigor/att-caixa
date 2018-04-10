package br.com.adaptworks.triangulo.aceitacao.po;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CenarioTriangulo {

	WebDriver driver;
	
	@Before
	public void preCondicao() {
//		System.setProperty("webdriver.gecko.driver","/Volumes/HD/Documents/projects/adaptworks-projects/geckodriver");
		
		driver = new FirefoxDriver();
		driver.get("http://triangulo-1.herokuapp.com");
	}
	
	@After
	public void posCondicao() {
		driver.quit();
	}
	
	/*
	 * Todos os metodos de teste abaixo usam o metodo encapsulado do page objects
	 */
	@Test
	public void testeTrianguloEquilatero() {
		TrianguloPagina pagina = new TrianguloPagina(driver);
		pagina.calculaTriangulo("1","1","1");
		assertEquals("Triângulo Equilatero", pagina.pegarResultado());
	}

	@Test
	public void testeTrianguloEscaleno() {
		TrianguloPagina pagina = new TrianguloPagina(driver);
		pagina.calculaTriangulo("2","3","4");
		assertEquals("Triângulo Escaleno", pagina.pegarResultado());
	}	

	@Test
	public void testeTrianguloIsosceles() {
		TrianguloPagina pagina = new TrianguloPagina(driver);
		pagina.calculaTriangulo("1","2","2");
		assertEquals("Triângulo Isósceles", pagina.pegarResultado());
	}	
	
	/*
	 * O teste abaixo utiliza a forma descritiva do page objects
	 */
	@Test
	public void testeTrianguloIsoscelesDescritivo() {
		TrianguloPagina pagina = new TrianguloPagina(driver);
		pagina.preencherLado1("1");
		pagina.preencherLado2("2");
		pagina.preencherLado3("2");
		pagina.clicarNoBotaoCalcular();
		assertEquals("Triângulo Isósceles", pagina.pegarResultado());
	}
	
}
