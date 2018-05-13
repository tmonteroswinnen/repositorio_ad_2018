package negocio;

import java.util.List;

public class Despacho {
	
	private List <Pedido> pedidos;

	public Pedido revisarListaPedidos(List<Pedido> pedidos ){
		return null;
	}
	public void actualizaEstadoPedido(Pedido ped, EstadoPedido est){
		
	}
	public void facturarPedido(Pedido p){
		
	}
	public void solicitarArticulos(Pedido pedido){
		
	}
	public void emitirComprobantes(Pedido pedido){
		
	}
	public Pedido buscarPedido(int idPedido){
		return null;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
