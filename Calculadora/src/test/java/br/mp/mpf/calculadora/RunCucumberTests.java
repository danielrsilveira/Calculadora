package br.mp.mpf.calculadora;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true, features="src/test/resources")
public class RunCucumberTests {
}
