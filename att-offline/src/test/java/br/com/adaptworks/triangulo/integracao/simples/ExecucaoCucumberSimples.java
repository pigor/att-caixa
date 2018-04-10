package br.com.adaptworks.triangulo.integracao.simples;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:target/cucumber/simples"},
	features={"src/test/resources/br/com/adaptworks/cucumber/integracao/simples"})
public class ExecucaoCucumberSimples {

}
