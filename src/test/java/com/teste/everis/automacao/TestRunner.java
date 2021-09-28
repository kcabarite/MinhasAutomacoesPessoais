package com.teste.everis.automacao;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber" }, 
		glue={"everis"},
		monochrome = true,
		tags = "@PrecoProduto",
		features = "src/test/resources/Validar_Preco_Produto.feature")

public class TestRunner {
	


}
