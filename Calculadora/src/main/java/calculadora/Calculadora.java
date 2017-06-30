package calculadora;

import java.text.DecimalFormat;

public class Calculadora {
	
	public String adicao(int arg1, int arg2){
		return Integer.toString(arg1 + arg2);
	}

	public String dividir(int arg1, int arg2) {
		if(arg2 == 0){
			return "Erro: divisão por zero";
		} else {
			return new DecimalFormat("0.#").format(arg1/arg2);
		}
	}
}
