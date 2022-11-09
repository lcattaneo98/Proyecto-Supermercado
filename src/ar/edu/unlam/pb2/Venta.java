package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Venta {

	private Integer dniComprador;
	private String nombre;
	private List<Producto> carritoDeLasCompras;
	private Double importe;

	public Venta(Integer dniComprador, String nombre) {
		this.dniComprador = dniComprador;
		this.nombre = nombre;
		this.carritoDeLasCompras = new ArrayList<Producto>();
		this.importe = 0.0;

	}

	public Integer getDniComprador() {
		return dniComprador;
	}

	public String getNombre() {
		return nombre;
	}

	public void agregarProductosAlCarrito(Producto producto) {
		carritoDeLasCompras.add(producto);
		this.importe += producto.getPrecio();

	}

	public double getImporte() {
		// TODO Auto-generated method stub
		return importe;
	}

}
