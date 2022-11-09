package ar.edu.unlam.pb2;

public class Heladera extends Producto implements Electrodomestico {

	private Boolean noFrost;
	private Integer garantia;

	public Heladera(Integer codigoDeProducto, String descripcion, Boolean noFrost, Integer garantia, String marca,
			Double precio) {
		super(codigoDeProducto, descripcion, marca, precio);
		this.noFrost = noFrost;
		this.garantia = garantia;

	}

	public Boolean isNoFrost() {
		return noFrost;
	}

	@Override
	public Integer getGarantia() {
		return garantia;
	}

}
