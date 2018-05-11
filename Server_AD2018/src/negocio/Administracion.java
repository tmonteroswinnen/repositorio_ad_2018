package negocio;

import java.util.List;

public class Administracion {
	
	private List<Cliente> clientes;
	private List<Pedido> pedidos;
	
	public void altaCliente(String nombre, String tipoDoc, String nroDoc, CuentaCorriente ctaCte, String direccion) {
		
	}
	
	public void modificarCliente (Cliente cli, String nuevaDireccion) {
		
	}
	
	public void bajaCliente(Cliente cli) {
		
	}
	
	public void altaPedidos(List<ItemPedido> items, String tipoDoc, String nroDoc, CuentaCorriente ctaCte, String direccion) {
		
	}
	
	public void aprobarPedidoManual(Pedido pedido, String aclaracion) {
		
	}
	
	public void rechazarPedido(Pedido pedido, String motivo) {
		
	}
	
	public boolean validarPedidoCliente(Cliente cliente, Pedido pedido) {
		
	}
	
	public List<Pedido> consutarPedidoCliente(Cliente cliente){
		
	}

}
