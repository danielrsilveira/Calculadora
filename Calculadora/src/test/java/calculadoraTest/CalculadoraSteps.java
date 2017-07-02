package calculadoraTest;

import static org.junit.Assert.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

import calculadora.Calculadora;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@SpringBootTest
public class CalculadoraSteps {
	private Calculadora calculadora;
	
	@Dado("^que eu acabei de ligar minha calculadora$")
	public void que_eu_acabei_de_ligar_minha_calculadora() throws Throwable {
	    calculadora = new Calculadora();
	}

	@Quando("^eu adiciono (\\d+) e (\\d+)$")
	public void eu_adiciono_e(int arg1, int arg2) throws Throwable {
		calculadora.adicao(arg1, arg2);
	}

	@Então("^o resultado é (\\d+)$")
	public void o_resultado_é(int arg1) throws Throwable {
	    assertEquals(String.valueOf(arg1), calculadora.getResultado());
	}
	
	@Quando("^eu divido (\\d+) por (\\d+)$")
	public void eu_divido_por(int arg1, int arg2) throws Throwable {
	    calculadora.dividir(arg1, arg2);
	}

	@Então("^o resultado é \"([^\"]*)\"$")
	public void o_resultado_é(String arg1) throws Throwable {
		assertEquals(arg1, calculadora.getResultado());
	}

}
