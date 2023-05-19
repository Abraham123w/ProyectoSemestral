package model;

import model.Persona;

public abstract class Trabajador extends Persona {
	private int id;

	public abstract void getTipo();

	public abstract void calcularSueldo();

	public int getId() {
		return this.id;
	}

	public void setId(int aId) {
		this.id = aId;
	}
}