package br.edu.insper.desagil.alfandega;

public class Item {
	private String nome;
	private double valor;
	private double rate;
	private double tarifa;

	public Item(String nome, double valor, double rate) {
		this.nome = nome;
		this.valor = valor;
		this.rate = rate;
		this.tarifa = 0.01;
	}

	public String getNome() {
		return this.nome;
	}

	public double getValor() {
		return this.valor;
	}

	public double getRate() {
		return this.rate;
	}
	
	public double getTarifa() {
		return this.tarifa;
	}
}
