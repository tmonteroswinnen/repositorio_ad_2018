package negocio;

import java.util.Date;

public class Lote {

	private int idLote;
	
	private Date fechaVencimiento;
	
	private String descripcion;
	
	private int cantidad;

	public int getIdLote() {
		return idLote;
	}
	
	public int cuantosLotesEntran(Posicion pos){
		return 0;
	}
	public boolean hoyMeVenzo(){
		return false;
	}
	
	public int diasAVencer(){
		return 0;
	}

	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}