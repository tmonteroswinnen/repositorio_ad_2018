package negocio;

public class ItemOrdenCompra {
	
	private int idItemOrdenCompra; 
	
	private Articulo articulo;
	
	private int cantidad;
	
	private float precioTotal;
	
	public float subtotal(){
		return 0;
	}

	public int getIdItemOrdenCompra() {
		return idItemOrdenCompra;
	}

	public void setIdItemOrdenCompra(int idItemOrdenCompra) {
		this.idItemOrdenCompra = idItemOrdenCompra;
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

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
}
