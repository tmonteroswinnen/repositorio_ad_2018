package negocio;

public class ItemPedido {
	
	private Articulo articulo;
	private int cantidad;
	private float precio;
	
	public float subTotal() {
		return cantidad*precio;
	}
	
	public boolean chequearStock() {
		return true;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
}