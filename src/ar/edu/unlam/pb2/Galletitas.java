package ar.edu.unlam.pb2;

public class Galletitas extends Producto implements Comestible {

	private String fechaDeElaboracion;
	private String fechaDeVencimiento;

	public Galletitas(Integer codigoDeProducto, String descripcion, String fechaDeElaboracion,
			String fechaDeVencimiento, String marca, Double precio) {
		super(codigoDeProducto, descripcion, marca, precio);
		this.fechaDeElaboracion = fechaDeElaboracion;
		this.fechaDeVencimiento = fechaDeVencimiento;

	}

	@Override
	public String getFechaDeElaboracion() {
		return fechaDeElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

}
