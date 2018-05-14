package controlador;

import java.util.List;

import negocio.Administracion;

public class Sistema {
	
	private static Sistema instancia;
	private List<Compra> compras;
	private Administracion administracion;
	private Despacho despacho;
	private Facturacion facturacion;
	private Deposito deposito;
	private List<Movimiento> movimientos;
	
	public static Sistema getInstancia() {
		if (instancia == null) {
			instancia = new Sistema();
		}
		return instancia;
	}
	
	//lspablo

}
