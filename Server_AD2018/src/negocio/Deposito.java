package negocio;

import java.util.List;

public class Deposito {

	private List<Calle> calles;

	private List<Pedido> pedidos;

	private List<Articulo> articulos;

	public boolean hayMercaderia(Articulo articulo){
		return true;
	}
	public void emitirOrdenPedido(Articulo articulo){
		
	}
	public void actualizarArticulos(Pedido p){
		
	}
	public void ubicarArticulo(Articulo art, Lote lot, int cant){
		
	}
	public Articulo buscarArticulo(Articulo art){
		return null;
	}
	public List<Posicion> buscarUbicacionArticulo(Articulo art){
		return null;
	}
	public List<Posicion> buscarUbicacionArticuloPedido(Pedido ped, int cantidad){
		return null;
		
	}
	public void realizarAjuste(MovimientoStock mov){ // es movimientoStock?????
		
	}
	public boolean verificarStock(Pedido ped){
		return true;
	}
	public List<Calle> getCalles() {
		return calles;
	}
	public void setCalles(List<Calle> calles) {
		this.calles = calles;
	}
	public List<Pedido> getOrdenesPedido() {
		return pedidos;
	}
	public void setpedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public List<Articulo> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
}
	
