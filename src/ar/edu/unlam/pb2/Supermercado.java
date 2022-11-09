package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {

	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el n�mero de venta)
	Integer contadorDeVentas = 0; // Identificador del n�mero de venta

	public Supermercado(String nombre) {
		this.nombre = nombre;
		this.productosDisponibles = new ArrayList();
		this.productosExistentes = new HashSet<Producto>();
		this.ventasRealizadas = new HashMap<Integer, Venta>();
	}

	public void ingresarProducto(Producto producto) {
		this.productosExistentes.add(producto);
		this.productosDisponibles.add(producto);
	}

	public Set<Producto> getOfertaDeProductos() {
		// TODO Auto-generated method stub
		return productosExistentes;
	}

	public Integer getStock(Integer codigoDeProducto) {
		List<Producto> stockFiltradoPorCodigo = new ArrayList<Producto>();
		for (Producto producto : productosDisponibles) {
			if (producto.getCodigoDeProducto() == codigoDeProducto) {
				stockFiltradoPorCodigo.add(producto);
			}
		}
		return stockFiltradoPorCodigo.size();
	}

	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto)
			throws ProductoSinStock, ProductoInexistente {
		Venta ventaEncontrada = getVenta(numeroDeVenta);
		if (productoExiste(codigoDeProducto) == true) {
			
			ventaEncontrada.agregarProductosAlCarrito(getProductoPorCodigo(codigoDeProducto));
			ventasRealizadas.put(numeroDeVenta, ventaEncontrada);
			productosDisponibles.remove(getProductoPorCodigo(codigoDeProducto));
		}

		// Incorpora al carrito de compras de la venta identificada por el
		// "numeroDeVenta", el producto
		// identificado por el "codigoDeProducto" }
	}

	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente {
		for (Producto producto : productosExistentes) {
			if (producto.getCodigoDeProducto() == codigoDeProducto) {
				return true;
			}
		}
		throw new ProductoInexistente();
	}

	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {

		for (Producto producto : productosDisponibles) {
			if (producto.getCodigoDeProducto() == codigoDeProducto) {
				return producto;
			}
		}
		throw new ProductoSinStock();

	}

	public Venta getVenta(Integer numeroDeVentaBuscado) { // Devuelve una venta en funci�n de su n�mero identificatorio
		for (Map.Entry<Integer, Venta> entry : ventasRealizadas.entrySet()) {
			Integer nroDeVentaRealizada = entry.getKey();
			Venta ventaRealizada = entry.getValue();
			if (nroDeVentaRealizada == numeroDeVentaBuscado) {
				return ventaRealizada;
			}
		}
		return null;
	}

}
