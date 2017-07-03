package calculadora;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.adapter.cucumber.FluentCucumberTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.github.bonigarcia.wdm.ChromeDriverManager;

@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT)
@ContextConfiguration
public class CalculadoraSteps extends FluentCucumberTest{
	
	@Override 
	public WebDriver newWebDriver() {
		ChromeDriverManager.getInstance().setup();
		return new ChromeDriver();
	}
	
	@Dado("^que eu acabei de ligar minha calculadora$")
	public void que_eu_acabei_de_ligar_minha_calculadora() throws Throwable {
		goTo("http://localhost:8080");
	}

	@Quando("^eu adiciono (\\d+) e (\\d+)$")
	public void eu_adiciono_e(int arg1, int arg2) throws Throwable {
		$("#numero"+String.valueOf(arg1)).click();
		$("#somar").click();
		$("#numero"+String.valueOf(arg2)).click();
		$("#igual").click();
	}

	@Então("^o resultado é (\\d+)$")
	public void o_resultado_é(int arg1) throws Throwable {
	    assertThat($("#total").text()).isEqualTo(String.valueOf(arg1));
	}
	
	@Quando("^eu divido (\\d+) por (\\d+)$")
	public void eu_divido_por(int arg1, int arg2) throws Throwable {
		$("#numero"+String.valueOf(arg1)).click();
		$("#dividir").click();
		$("#numero"+String.valueOf(arg2)).click();
		$("#igual").click();
	}

	@Então("^o resultado é \"([^\"]*)\"$")
	public void o_resultado_é(String arg1) throws Throwable {
		assertThat($("#total").text()).isEqualTo(arg1);
	}
	
	@Before
	public void before(Scenario scenario) {
	    super.before(scenario);
	}

	@After
	public void after(Scenario scenario) {
	    super.after(scenario);
	}

}
