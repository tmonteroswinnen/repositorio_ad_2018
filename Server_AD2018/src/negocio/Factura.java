package negocio;

import java.util.Date;
import java.util.List;

public class Factura {
	
	public enum Tipo{
		A,B;
	}
	
	public enum EstadoFactura{
		paga, impaga;		
	}
	
	private int idFactura;
	private List<ItemFactura> itemsFactura;
	private Cliente cliente;
	private Pedido pedido;
	private Tipo tipo;
	private EstadoFactura estado;
	private Date fechaPago;
	
	
	public float total() {
		return 0;
	}
	
	public ItemFactura nuevoItemFactura(Articulo articulo, int cantidad) {
		return null;
	}
	
	public void actualizarEstado(EstadoFactura estado) {
		
	}
	
	public void pagar(){
		
	}

}
