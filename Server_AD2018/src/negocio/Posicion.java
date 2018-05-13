package negocio;

public class Posicion {
	
	private int idPosicion;
	
	private int espacio;
	
	private Articulo articulo;
	
	private String Estado;
	
	private int cantidadArticulos;
	
	public boolean  estoyLleno(){
		return true;
	}
	
	public boolean tengoEspacio(){
		return true;
	}
	public boolean estoyVacio(){
		return true;
	}
	public boolean puedoGuardarArticulo(Articulo art){
		return true;
	}
	public int capacidadDisponible(){
		return 0;
	}
	
	public int getIdPosicion() {
		return idPosicion;
	}

	public void setIdPosicion(int idPosicion) {
		this.idPosicion = idPosicion;
	}

	public int getEspacio() {
		return espacio;
	}

	public void setEspacio(int espacio) {
		this.espacio = espacio;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public int getCantidadArticulos() {
		return cantidadArticulos;
	}

	public void setCantidadArticulos(int cantidadArticulos) {
		this.cantidadArticulos = cantidadArticulos;
	}
}
