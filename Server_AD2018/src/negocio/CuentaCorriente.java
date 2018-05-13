package negocio;

public class CuentaCorriente {
	
	private float saldo;
	private EstadoCuentaCorriente estado;
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

	public EstadoCuentaCorriente getEstado() {
		return estado;
	}

	public void setEstado(EstadoCuentaCorriente estado) {
		this.estado = estado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
}