package es.studium.AcademiaDeIdiomas;
/* Creo, en primer lugar, la clase POJO Asignatura.*/
public class Asignatura
{
	// ATRIBUTOS
	/* A continuación, creamos los atributos como privados. Esto los encapsulará y solo
	 * serán accesibles de la propia clase. En este caso, tenemos dos de tipo String, que
	 * quiere decir que es alfanumérico y, otro, de tipo int (entero), que hace referencia
	 * a números enteros. Los nombres que asignemos a los atributos no pueden ir con tildes 
	 * ni con la ñ.*/
	private String nombre;
	private int horasAsignatura;
	private String codigo;
	// CONSTRUCTORES VACIOS O POR DEFECTO
	/* Después, declaro los constructores vacíos o por defecto. Aquí se indica el valor de 
	 * cada atributo anteriomente declarado con el valor nulo o por defecto del mismo. El nombre 
	 * que tienen los constructores son los mismos que el de la clase pero empezando por 
	 * mayúscula. Suelen ir con el modificador de acceso public.*/
	public Asignatura()
	{
		nombre = "";
		horasAsignatura = 0;
		codigo = "";
	}
	// CONSTRUCTORES POR PARÁMETROS
	/* Seguidamente, van los constructores por parámetros. En estos, asigno los valores de los 
	 * parámetros atribuidos de la clase. Para ello, uso eclipse en el menú Source- Generate
	 * Constructor using Fields... */
	public Asignatura(String nombre, int horasAsignatura, String codigo)
	{
		this.nombre = nombre;
		this.horasAsignatura = horasAsignatura;
		this.codigo = codigo;
	}
	// MÉTODOS INSPECTORES
	/*Por último, escribo los métodos inspectores, que son los get y set. Creamos un 
	 * método set y otro método get por cada atributo que he declarado. Estos suelen declararse
	 * con modificador de acceso public. Como con el anterior, para generarlo, uso eclipse en 
	 * el menú Source- Generate Getters and Setters...*/
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public int getHorasAsignatura()
	{
		return horasAsignatura;
	}
	public void setHorasAsignatura(int horasAsignatura)
	{
		this.horasAsignatura = horasAsignatura;
	}
	public String getCodigo()
	{
		return codigo;
	}
	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}
	
}
