package br.com.adaptworks.triangulo.integracao.ui;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:target/cucumber/tabela_exemplo"},
	features={"src/test/resources/br/com/adaptworks/cucumber/integracao/ui"})
public class ExecucaoCucumberUI {
	
}
