package negocio;

import java.util.Date;
import java.util.List;

public class Remito {
	
	private int idRemito;
	
	private Date fechaEmision;
	
	private Cliente cliente;
	
	private Pedido pedido;
	
	private List<ItemRemito> itemsRemito;
	
	public ItemRemito nuevoItemRemito(Articulo articulo, int cantidad){
		return null;
	}

	public int getIdRemito() {
		return idRemito;
	}

	public void setIdRemito(int idRemito) {
		this.idRemito = idRemito;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<ItemRemito> getItemsRemito() {
		return itemsRemito;
	}

	public void setItemsRemito(List<ItemRemito> itemsRemito) {
		this.itemsRemito = itemsRemito;
	}
}
