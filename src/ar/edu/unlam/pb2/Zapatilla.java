package ar.edu.unlam.pb2;

public class Zapatilla extends Producto implements Indumentaria {

	private String talle;
	private String color;

	public Zapatilla(Integer codigoDeProducto, String descripcion, String talle, String nombre, String color,
			Double precio) {
		super(codigoDeProducto, descripcion, nombre, precio);
		this.talle = talle;
		this.color = color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public String getTalle() {
		return talle;
	}

}
