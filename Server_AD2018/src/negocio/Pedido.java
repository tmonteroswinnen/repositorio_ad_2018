package negocio;

import java.util.Date;
import java.util.List;

public class Pedido {
	
	public enum EstadoPedido{
		pendiente, deposito, despachado, entregado, rechazado, aprobado, pendienteAprobacion;
	}
	
	private int idPedido;
	private Cliente cliente;
	private Date fechaGeneracion;
	private Date fechaDespacho;
	private Date fechaEntrega;
	private List<ItemPedido> itemsPedido;
	private float totalBruto;
	private EstadoPedido estadoPedido;
	private String direccionEnvio;
	private String aclaracion;
	
	
	public float calcularTotal() {
		
	}
	
	public void nuevoItemPedido(Articulo articulo, int cantidad) {
		
	}
	
	public void actualizarEstado (String estado) {
		
	}
	
	public boolean chequearStock() {
		
	}
	
	

}
