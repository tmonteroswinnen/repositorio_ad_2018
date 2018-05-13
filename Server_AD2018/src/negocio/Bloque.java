package negocio;

import java.util.List;

public class Bloque {
	
	private int idBloque;
	
	private List<Estanteria> estanterias; 
	
	public Estanteria obtenerEstanteriaConEspacio(){
		return null;
	}
	
	public boolean tengoEstanteriasDesocupadas(){
		return true;
	}

	public int getIdBloque() {
		return idBloque;
	}

	public void setIdBloque(int idBloque) {
		this.idBloque = idBloque;
	}

	public List<Estanteria> getEstanterias() {
		return estanterias;
	}

	public void setEstanterias(List<Estanteria> estanterias) {
		this.estanterias = estanterias;
	}
}
