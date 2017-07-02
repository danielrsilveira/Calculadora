package calculadora;

import java.text.DecimalFormat;

public class Calculadora {
	private String resultado;
	
	public void adicao(int arg1, int arg2){
		this.resultado = Integer.toString(arg1 + arg2);
	}

	public void dividir(int arg1, int arg2) {
		if(arg2 == 0){
			this.resultado = "Erro: divisão por zero";
		} else {
			this.resultado = new DecimalFormat("###.#").format((float)arg1/arg2);
		}
	}

	public String getResultado() {
		return this.resultado;
	}
}
