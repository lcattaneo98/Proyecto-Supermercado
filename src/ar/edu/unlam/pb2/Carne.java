package ar.edu.unlam.pb2;

public class Carne extends Producto implements Comestible {

	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	private Double kilos;

	public Carne(Integer codigoDeProducto, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento,
			Double kilos, String marca, Double precio) {
		super(codigoDeProducto, descripcion, marca, precio);
		this.fechaDeElaboracion = fechaDeElaboracion;
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.kilos = kilos;

	}

	@Override
	public String getFechaDeElaboracion() {
		return fechaDeElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public Double getKilos() {
		return kilos;
	}

}
