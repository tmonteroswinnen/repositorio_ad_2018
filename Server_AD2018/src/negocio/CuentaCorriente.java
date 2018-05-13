package negocio;

public class CuentaCorriente {
	
	private float saldo;
	private String estado;
	private String motivo;

	public String verificarEstado() {
		return "";
	}
	
	public void actualizarEstado(String Estado, String motivo) {
		
	}
	
	public float saldoDosponible() {
		return 0;
	}
	
	public float actualizarSaldo(float monto) {
		return 0;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
}