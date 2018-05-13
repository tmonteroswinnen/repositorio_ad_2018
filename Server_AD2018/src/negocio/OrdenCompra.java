package negocio;

import java.util.Date;
import java.util.List;

public class OrdenCompra {

	private int idOrdenCompra;
	
	private Proveedor proveedor;
	
	private Date fecha;
	
	private EstadoOrdenCompra estado;
	
	private List <ItemOrdenCompra> itemsOrdenCompra; 
	
	private float precio; 

	public float calcularTotal(){
		return 0;
	}
	public ItemOrdenCompra nuevoItemOrdenCompra(Articulo art, int cant, float precio){
		return null;
	}
	public void marcarComoCumplida(){
		
	}
	public int getIdOrdenCompra() {
		return idOrdenCompra;
	}
	public void setIdOrdenCompra(int idOrdenCompra) {
		this.idOrdenCompra = idOrdenCompra;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public EstadoOrdenCompra getEstado() {
		return estado;
	}
	public void setEstado(EstadoOrdenCompra estado) {
		this.estado = estado;
	}
	public List<ItemOrdenCompra> getItemsOrdenCompra() {
		return itemsOrdenCompra;
	}
	public void setItemsOrdenCompra(List<ItemOrdenCompra> itemsOrdenCompra) {
		this.itemsOrdenCompra = itemsOrdenCompra;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
