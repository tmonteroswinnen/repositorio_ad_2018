package negocio;

import java.util.List;

public class Estanteria {
	
	private int idEstanteria;
	
	private List<Posicion> posiciones; 
	
	public Posicion obtenerPosiconConEspacio(){
		return null;
	}
	public Posicion obtenerPosicionDesocupada(){
		return null;
	}
	public int getIdEstanteria() {
		return idEstanteria;
	}
	public void setIdEstanteria(int idEstanteria) {
		this.idEstanteria = idEstanteria;
	}
	public List<Posicion> getPosiciones() {
		return posiciones;
	}
	public void setPosiciones(List<Posicion> posiciones) {
		this.posiciones = posiciones;
	}
}
