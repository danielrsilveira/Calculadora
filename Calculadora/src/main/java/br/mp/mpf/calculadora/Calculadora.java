package br.mp.mpf.calculadora;

import java.text.DecimalFormat;

public class Calculadora {

	private String resultado;
	
	public void adicionar(int arg1, int arg2) {
		this.resultado = String.valueOf(arg1 + arg2);
	}

	public String getResultado() {
		return resultado;
	}

	public void dividir(int arg1, int arg2) {
		if(arg2 == 0){
			this.resultado = "Erro: divisão por zero";
		} else {
			this.resultado = new DecimalFormat("###.#").format((float)arg1/arg2);
		}
	}
	
}
