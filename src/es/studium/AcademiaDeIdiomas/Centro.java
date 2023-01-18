package es.studium.AcademiaDeIdiomas;

public class Centro
{
	// ATRIBUTOS
	private String nombre;
	private String direccion;
	private String codigo;
	// CONSTRUCTORES VACIOS 
	public Centro()
	{
		nombre = "";
		direccion = "";
		codigo = "";
	}
	// CONSTRUCTORES POR PARÁMETROS
	public Centro(String nombreCentro, String direccionCentro, String codigoCentro)
	{
		this.nombre = nombreCentro;
		this.direccion = direccionCentro;
		this.codigo = codigoCentro;
	}
		// MÉTODOS INSPECTORES
	public String getNombreCentro()
	{
		return nombre;
	}
	public void setNombreCentro(String nombreCentro)
	{
		this.nombre = nombreCentro;
	}
	public String getDireccionCentro()
	{
		return direccion;
	}
	public void setDireccionCentro(String direccionCentro)
	{
		this.direccion = direccionCentro;
	}
	public String getCodigoCentro()
	{
		return codigo;
	}
	public void setCodigoCentro(String codigoCentro)
	{
		this.codigo = codigoCentro;
	}
}
