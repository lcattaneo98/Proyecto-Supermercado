package ar.edu.unlam.pb2;

public class Televisor extends Producto implements Electrodomestico {

	private Integer pulgadas;
	private Integer garantia;

	public Televisor(Integer codigoDeProducto, String descripcion, String marca, Double precio) {
		super(codigoDeProducto, descripcion, marca, precio);
		
	}

	public Televisor(Integer codigoDeProducto, String descripcion, Integer pulgadas, Integer garantia, String nombre, Double precio) {
		super(codigoDeProducto, descripcion, nombre, precio);
		this.pulgadas = pulgadas;
		this.garantia = garantia;
	}

	public Integer getPulgadas() {
		return pulgadas;
	}

	@Override
	public Integer getGarantia() {
		return garantia;
	}

}
