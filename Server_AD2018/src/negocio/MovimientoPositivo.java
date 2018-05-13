package negocio;

public class MovimientoPositivo extends MovimientoStock{
	
	private OrdenCompra compra;
	
	public int devolverCantidad(){
		return 0;
	}
	
	public OrdenCompra getCompra() {
		return compra;
	}

	public void setCompra(OrdenCompra compra) {
		this.compra = compra;
	}
}
