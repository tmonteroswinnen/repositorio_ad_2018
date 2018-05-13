package negocio;

import java.util.Date;
import java.util.List;

public class Factura {
	
	private int idFactura;
	private List<ItemFactura> itemsFactura;
	private Cliente cliente;
	private Pedido pedido;
	private TipoFactura tipo;
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

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public List<ItemFactura> getItemsFactura() {
		return itemsFactura;
	}

	public void setItemsFactura(List<ItemFactura> itemsFactura) {
		this.itemsFactura = itemsFactura;
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

	public TipoFactura getTipo() {
		return tipo;
	}

	public void setTipo(TipoFactura tipo) {
		this.tipo = tipo;
	}

	public EstadoFactura getEstado() {
		return estado;
	}

	public void setEstado(EstadoFactura estado) {
		this.estado = estado;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
}