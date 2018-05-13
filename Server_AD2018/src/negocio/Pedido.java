package negocio;

import java.util.Date;
import java.util.List;

public class Pedido {
	
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
		return 0;
	}
	
	public void nuevoItemPedido(Articulo articulo, int cantidad) {
		
	}
	
	public void actualizarEstado (String estado) {
		
	}
	
	public boolean chequearStock() {
		return true;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public Date getFechaDespacho() {
		return fechaDespacho;
	}

	public void setFechaDespacho(Date fechaDespacho) {
		this.fechaDespacho = fechaDespacho;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public List<ItemPedido> getItemsPedido() {
		return itemsPedido;
	}

	public void setItemsPedido(List<ItemPedido> itemsPedido) {
		this.itemsPedido = itemsPedido;
	}

	public float getTotalBruto() {
		return totalBruto;
	}

	public void setTotalBruto(float totalBruto) {
		this.totalBruto = totalBruto;
	}

	public EstadoPedido getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(EstadoPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public String getDireccionEnvio() {
		return direccionEnvio;
	}

	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}

	public String getAclaracion() {
		return aclaracion;
	}

	public void setAclaracion(String aclaracion) {
		this.aclaracion = aclaracion;
	}
}