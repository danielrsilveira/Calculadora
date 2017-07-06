package br.mp.mpf.calculadora;

public class Calculadora {

	private int resultado;
	
	public void adicionar(int arg1, int arg2) {
		this.resultado = arg1 + arg2;
	}

	public int getResultado() {
		return resultado;
	}
	
}
