package negocio;

public class Articulo {
	
	private int idArticulo;
	
	private String codigoBarras;
	
	private String descripcion;
	
	private int unidad;
	
	private TipoPresentacion presentacion;
	
	private String tamanio;
	
	private Lote lote;
	
	private MovimientoStock movimientos;
	
	private Posicion ubicacion;
	
	private float precioVenta;
	
	private int cantidadCompra;
	
	private int cantidadPorUbicacion;
	
	public int cuantosArtsEntran(Posicion pos){
		return 0;
	}
	
	public boolean hoyMeVenzo( ){
		return false;
	}
	
	public void MovimientoStock(int nroMov,String fecha, String encargado, float cant, String tipoMovComun){
		
	}

	public int getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getUnidad() {
		return unidad;
	}

	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}

	public TipoPresentacion getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(TipoPresentacion presentacion) {
		this.presentacion = presentacion;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public MovimientoStock getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(MovimientoStock movimientos) {
		this.movimientos = movimientos;
	}

	public Posicion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Posicion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getCantidadCompra() {
		return cantidadCompra;
	}

	public void setCantidadCompra(int cantidadCompra) {
		this.cantidadCompra = cantidadCompra;
	}

	public int getCantidadPorUbicacion() {
		return cantidadPorUbicacion;
	}

	public void setCantidadPorUbicacion(int cantidadPorUbicacion) {
		this.cantidadPorUbicacion = cantidadPorUbicacion;
	}
	
	
	
	

}
