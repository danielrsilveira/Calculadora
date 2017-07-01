package calculadora;

import java.text.DecimalFormat;

public class Calculadora {
	
	public String resultado;
	
	public void adicao(int arg1, int arg2){
		resultado = Integer.toString(arg1 + arg2);
	}

	public void dividir(int arg1, int arg2) {
		if(arg2 == 0){
			resultado = "Erro: divisão por zero";
		} else {
			resultado = new DecimalFormat("###.#").format((float)arg1/arg2);
		}
	}
}
