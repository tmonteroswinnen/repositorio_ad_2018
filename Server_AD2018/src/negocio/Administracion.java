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
		return true;
	}
	
	public List<Pedido> consutarPedidoCliente(Cliente cliente){
		return null;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}