package negocio;

import java.util.List;

public class Compras {

	private List<Proveedor> proveedores;

	private List<OrdenCompra> ordenesCompra;
	
	public void procesarOrdenPedido(Pedido p){
		
	}
	
	public void emitirOrdencompra(List<Articulo> articulos){
		
	}
	
	public List<Proveedor> ultimosProveedores(Articulo art){
		return null;
	}
	
	public void elegirProveedor(Articulo art, Proveedor proveedor){
		
	}
	
	public void actualizarOC(OrdenCompra oc, EstadoOrdenCompra est){
		
	}

	public List<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(List<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	public List<OrdenCompra> getOrdenesCompra() {
		return ordenesCompra;
	}

	public void setOrdenesCompra(List<OrdenCompra> ordenesCompra) {
		this.ordenesCompra = ordenesCompra;
	}
}
