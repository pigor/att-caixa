package br.com.adaptworks.triangulo.integracao.ui;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TrianguloUIStepsDefinition {

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

	@Quando("^eu informo o lado2 com valor (\\d+)$")
	public void eu_informo_o_lado2_com_valor(int l2) throws Throwable {
	    lado2 = l2;
	}	

	@Quando("^eu informo o lado3 com valor (\\d+)$")
	public void eu_informo_o_lado3_com_valor(int l3) throws Throwable {
	    lado3 = l3;
	}
	
	@Entao("^exibe a mensagem \"([^\"]*)\"$")
	public void exibe_a_mensagem(String mensagem) throws Throwable {
		System.setProperty("webdriver.gecko.driver","/Volumes/HD/Documents/projects/adaptworks-projects/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://triangulos-1.herokuapp.com/");
		
		driver.findElement(By.id("triangulo_lado1")).sendKeys(String.valueOf(lado1));
		driver.findElement(By.id("triangulo_lado2")).sendKeys(String.valueOf(lado2));
		driver.findElement(By.id("triangulo_lado3")).sendKeys(String.valueOf(lado3));
		
		driver.findElement(By.name("commit")).click();
		
		String resultado = driver.findElement(By.className("mensagem")).getText();
		
		driver.quit();
		
		assertEquals(mensagem, resultado);
	}
	
}
