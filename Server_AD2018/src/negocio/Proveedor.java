package negocio;

import java.util.List;

public class Proveedor {
	
	private int idProveedor;
	
	private List<Articulo> articulosVende; 
	
	public boolean vendoArticulo(Articulo art){
		return true;
	}
	
	public float precioVenta(Articulo art){
		return 0;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public List<Articulo> getArticulosVende() {
		return articulosVende;
	}

	public void setArticulosVende(List<Articulo> articulosVende) {
		this.articulosVende = articulosVende;
	}
}
