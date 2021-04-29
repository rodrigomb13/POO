package br.com.lojavirtual.informatica;

public class Teclado {

	private boolean USB;
	private int qtdTeclas;

	public int getQtdTeclas() {
		return qtdTeclas;
	}

	public void setQtdTeclas(int qtdTeclas) {
		this.qtdTeclas = qtdTeclas;
	}
	public boolean isUSB() {
		return USB;
	}
	public void setUSB(boolean USB) {
		this.USB=USB;
	}
}
