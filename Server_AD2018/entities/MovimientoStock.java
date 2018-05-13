package entities;

import java.util.Date;

public class MovimientoStock {
	
	protected int idMovimiento;
		
	protected Date fecha;

	protected Articulo articulo;
	
	protected String tipoMovimiento;
	
	protected int cantidad;
	
	public int devolverCantidad(){
		return 0;
	}
	
	public String obtenerTipoMovimiento(){
		return "";
	}

	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
