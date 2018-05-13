package negocio;

public class MovimientoNegativo {
	
	private  Pedido pedido;
	
	public int devolverCantidad(){
		return 0;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}
