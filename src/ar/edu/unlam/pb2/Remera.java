package ar.edu.unlam.pb2;

public class Remera extends Producto implements Indumentaria {

	private String talle;
	private String color;

	public Remera(Integer codigoDeProducto, String descripcion, String talle, String marca, String color,
			Double precio) {
		super(codigoDeProducto, descripcion, marca, precio);
		this.talle = talle;
		this.color = color;
	}

	@Override
	public String getTalle() {
		return talle;
	}

	public String getColor() {
		return color;
	}

}
