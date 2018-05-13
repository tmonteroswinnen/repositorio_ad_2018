package negocio;

import java.util.List;

public class Facturacion {
	
	private List<Factura> facturas;
	
	private List<Remito> remitos;
	
	private List<CuentaCorriente> cuentasCorrientes;

	public  Factura emitirFactura(Pedido pedido){
		return null;
	}
	
	public Remito emitirRemito(Pedido pedido, Factura factura){
		return null;
	}
	
	public void actualizarCtaCte(Cliente c , float monto){
		
	}
	
	public void registrarPago(Factura factura, float monto){
		
	}
	
	public List<Factura> buscarFacturasPorEstado(EstadoFactura estado){
		return null;
	}
	
	public List<Factura> buscarFacturasImpagas(EstadoFactura estado){
		return null;
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public List<Remito> getRemitos() {
		return remitos;
	}

	public void setRemitos(List<Remito> remitos) {
		this.remitos = remitos;
	}

	public List<CuentaCorriente> getCuentasCorrientes() {
		return cuentasCorrientes;
	}

	public void setCuentasCorrientes(List<CuentaCorriente> cuentasCorrientes) {
		this.cuentasCorrientes = cuentasCorrientes;
	}
}
