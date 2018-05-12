package negocio;

import negocio.*;

public class ItemFactura {
	
	private Articulo articulo;
	private int cantidad;
	private float precioUnitario;
	
	public float subTotal() {
		return this.precioUnitario*this.cantidad;
	}

}
