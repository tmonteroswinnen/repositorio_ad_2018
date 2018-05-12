package negocio;

public class ItemPedido {
	
	private Articulo articulo;
	private int cantidad;
	private float precio;
	
	
	public float subTotal() {
		return cantidad*precio;
	}
	
	public boolean chequearStock() {
	}

}
