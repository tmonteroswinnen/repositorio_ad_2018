package negocio;

public class ItemRemito {

	private Articulo articulo;
	
	private int cantidad;
	
	public float subTotal(){
		return 0;
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
}
