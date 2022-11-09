package ar.edu.unlam.pb2;

import java.util.Objects;

public class Producto {

	protected Integer codigoDeProducto;
	protected String descripcion;
	protected String marca;
	private Double precio;

	public Producto(Integer codigoDeProducto, String descripcion, String marca, Double precio) {
		this.codigoDeProducto = codigoDeProducto;
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;

	}
	

	public Integer getCodigoDeProducto() {
		return codigoDeProducto;
	}


	public Double getPrecio() {
		return precio;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoDeProducto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(codigoDeProducto, other.codigoDeProducto);
	}

}
