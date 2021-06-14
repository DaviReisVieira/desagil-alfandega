package br.edu.insper.desagil.alfandega;

public class ItemTarifado extends Item {
	private double tarifa;

	public ItemTarifado(String nome, double valor, double rate, double tarifa) {
		super(nome, valor, rate);
		this.tarifa = tarifa;
	}

	@Override
	public double getTarifa() {
		return this.tarifa;
	}
}
