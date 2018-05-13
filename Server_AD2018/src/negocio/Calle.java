package negocio;

import java.util.List;

public class Calle {
	
	private int idCalle;
	
	private List<Bloque> bloques;

	public Bloque obtenerBloqueConEspacio(Articulo art){
		return null;
	}

	public boolean tengoBloquesDesocupados(){
		return true;
	}
	
	public Bloque obtenerBloqueConEspacio(){
		return null;
	}

	public int getIdCalle() {
		return idCalle;
	}

	public void setIdCalle(int idCalle) {
		this.idCalle = idCalle;
	}

	public List<Bloque> getBloques() {
		return bloques;
	}

	public void setBloques(List<Bloque> bloques) {
		this.bloques = bloques;
	}
}
