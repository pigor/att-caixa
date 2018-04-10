package br.com.adaptworks.triangulo.integracao.tabela;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:target/cucumber/tabela"},
	features={"src/test/resources/br/com/adaptworks/cucumber/integracao/tabela"})
public class ExecucaoCucumberTabela {
	
}
