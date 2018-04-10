package br.com.adaptworks.triangulo.aceitacao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TrianguloAceitacao {
	
	@Before
	public void setup(){
		// C:\\Users\\...
		System.setProperty("webdriver.gecko.driver","/Volumes/HD/Documents/projects/adaptworks-projects/geckodriver");
	}

	@Test
	public void trianguloEquilatero() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:3000");
		
		driver.findElement(By.id("triangulo_lado1")).sendKeys("5");
		driver.findElement(By.id("triangulo_lado2")).sendKeys("5");
		driver.findElement(By.id("triangulo_lado3")).sendKeys("5");
		
		driver.findElement(By.name("commit")).click();
		
		String mensagem = driver.findElement(By.className("mensagem")).getText();
		
		driver.quit();
		
		assertEquals("Triângulo Equilatero", mensagem);
		
	}

	@Test
	public void trianguloIsosceles() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:3000");
		
		driver.findElement(By.id("triangulo_lado1")).sendKeys("1");
		driver.findElement(By.id("triangulo_lado2")).sendKeys("5");
		driver.findElement(By.id("triangulo_lado3")).sendKeys("5");
		
		driver.findElement(By.name("commit")).click();
		
		String mensagem = driver.findElement(By.className("mensagem")).getText();
		
		driver.quit();
		
		assertEquals("Triângulo Isosceles", mensagem);
		
	}
	
	@Test
	public void trianguloEscaleno() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:3000");
		
		driver.findElement(By.id("triangulo_lado1")).sendKeys("3");
		driver.findElement(By.id("triangulo_lado2")).sendKeys("5");
		driver.findElement(By.id("triangulo_lado3")).sendKeys("7");
		
		driver.findElement(By.name("commit")).click();
		
		String mensagem = driver.findElement(By.className("mensagem")).getText();
		
		driver.quit();
		
		assertEquals("Triângulo Escaleno", mensagem);
		
	}
}
