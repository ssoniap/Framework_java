package clases;
// Generated 25/11/2023, 10:36:59 p. m. by Hibernate Tools 6.3.1.Final


public class Ingredientes {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idIngrediente;
	private String nombreIngrediente;
	private String cantidad;
	private String unidadDeMedida;

	public Ingredientes() {
	}

	public Ingredientes(int idIngrediente, String nombreIngrediente, String cantidad, String unidadDeMedida) {
		this.idIngrediente = idIngrediente;
		this.nombreIngrediente = nombreIngrediente;
		this.cantidad = cantidad;
		this.unidadDeMedida = unidadDeMedida;
	}

	public int getIdIngrediente() {
		return this.idIngrediente;
	}

	public void setIdIngrediente(int idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public String getNombreIngrediente() {
		return this.nombreIngrediente;
	}

	public void setNombreIngrediente(String nombreIngrediente) {
		this.nombreIngrediente = nombreIngrediente;
	}

	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidadDeMedida() {
		return this.unidadDeMedida;
	}

	public void setUnidadDeMedida(String unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}

}
