package negocio;

public class Cliente {
	
	private CuentaCorriente cuentaCorriente;
	private String nombre;
	private String tipoDoc;
	private String nroDoc;
	private String direccion;
	private int limitecredito;
	private String condicionesPago;
	private String notaAdvertencia;
	
	public boolean validarClienteCredito(float totalPedido) {
		return true;
	}
	
	public void actualizarSaldo(float importe) {
		
	}

	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getLimitecredito() {
		return limitecredito;
	}

	public void setLimitecredito(int limitecredito) {
		this.limitecredito = limitecredito;
	}

	public String getCondicionesPago() {
		return condicionesPago;
	}

	public void setCondicionesPago(String condicionesPago) {
		this.condicionesPago = condicionesPago;
	}

	public String getNotaAdvertencia() {
		return notaAdvertencia;
	}

	public void setNotaAdvertencia(String notaAdvertencia) {
		this.notaAdvertencia = notaAdvertencia;
	}
}