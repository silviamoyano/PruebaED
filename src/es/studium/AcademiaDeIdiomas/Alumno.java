package es.studium.AcademiaDeIdiomas;

public class Alumno
{
	// ATRIBUTOS
	/* En este caso, a la hora de escribir los atributos, hemos hecho referencia los ya creados
	 * anteriormente en la clase Centro y Asignatura. El tipo de la variable sería Centro, para el
	 * centro donde cursa el alumno, y de tipo Asignatura, para indicar la asignatura que cursa.
	 * El resto de atributos se hace igual que como se ha explicado anteriormente. Aquí tenemos otro
	 * tipo de variable, float, que hace referencia a un número real.*/
	private String nombre;
	private String direccion;
	private int numeroMatricula;
	private float nota;
	private Centro centro;
	private Asignatura asignatura;
	// CONSTRUCTORES VACIOS O POR DEFECTO
	/* A la hora de declarar los constructores vacíos, los atributos "centro" y "asignatura" hay que 
	 * crearlos como nuevos para que coja un valor nulo o por defecto.
	 * Para el resto de constructores lo creamos igual, que como hemos explicado anteriormente.*/
	public Alumno()
	{
		nombre = "";
		direccion = "";
		numeroMatricula = 0;
		nota = 0.0f;
		centro = new Centro();
		asignatura = new Asignatura();
	}	
	// CONSTRUCTORES POR PARÁMETROS
	public Alumno(String nombre, String direccion, int numeroMatricula, float nota, Centro centro,
			Asignatura asignatura)
	{
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroMatricula = numeroMatricula;
		this.nota = nota;
		this.centro = centro;
		this.asignatura = asignatura;
	}
		// MÉTODOS INSPECTORES
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getDireccion()
	{
		return direccion;
	}
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	public int getNumeroMatricula()
	{
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula)
	{
		this.numeroMatricula = numeroMatricula;
	}
	public float getNota()
	{
		return nota;
	}
	public void setNota(float nota)
	{
		this.nota = nota;
	}
	public Centro getCentro()
	{
		return centro;
	}
	public void setCentro(Centro centro)
	{
		this.centro = centro;
	}
	public Asignatura getAsignatura()
	{
		return asignatura;
	}
	public void setAsignatura(Asignatura asignatura)
	{
		this.asignatura = asignatura;
	}
}
