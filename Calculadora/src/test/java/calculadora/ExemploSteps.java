package calculadora;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.adapter.cucumber.FluentCucumberTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class ExemploSteps extends FluentCucumberTest{
	
	@Dado("^que estou na página Informativo de Teses da PGR$")
	public void que_estou_na_página_Informativo_de_Teses_da_PGR() throws Throwable {
	    goTo("http://www.mpf.mp.br/pgr/institucional/procurador-geral-da-republica/informativo-de-teses");
	}

	@Quando("^pesquiso pelo termo \"([^\"]*)\"$")
	public void pesquiso_pelo_termo(String arg1) throws Throwable {
	    el("input[name=campobusca]").fill().with(arg1);
	}

	@Quando("^envio a pesquisa$")
	public void envio_a_pesquisa() throws Throwable {
	    el("input[name=Submit]").click();
	}

	@Então("^vejo uma lista de resultados não vazia$")
	public void vejo_uma_lista_de_resultados_não_vazia() throws Throwable {
		assertThat($("#content").$("table").$("tr").text()).doesNotContain("Número de documentos que contém a(s) palavra(s) procurada(s):0");
	}
	
	@Override 
	public WebDriver newWebDriver() {
		ChromeDriverManager.getInstance().setup();
		return new ChromeDriver();
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
