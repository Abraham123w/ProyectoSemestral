package model;

public class Producto {
	private String codigo;
	private String nombre;
	private String categoria;
	private String descripcion;

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String aCodigo) {
		this.codigo = aCodigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String aNombre) {
		this.nombre = aNombre;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String aCategoria) {
		this.categoria = aCategoria;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String aDescripcion) {
		this.descripcion = aDescripcion;
	}

	public Producto() {
		throw new UnsupportedOperationException();
	}
}