package es.studium.AcademiaDeIdiomas;

public class TestAcademiaDeIdiomas
{
	// Esta clase la creamos con el metodo main,  ya que si no podemos crear los objetos.
	public static void main(String[] args)
	{
		/* Aquí es donde vamos a crear los objetos.
		 * Los objetos en JAVA la podemos crear de dos formas, bien indicando sus características a
		 * través de cada atributo o bien, por el constructor por parámetros. 
		 * Realizaré los centros por cada atributo y el resto serán creados con el constructor por parámetros
		 * ya que aporta mayor rapidez.  */

		// Creamos los objetos "centro" por atributos:

		Centro centro1 = new Centro();
		centro1.setNombreCentro("Escuela de inglés.");
		centro1.setDireccionCentro("Reyes Católicos, 14.");
		centro1.setCodigoCentro("EOI");

		Centro centro2 = new Centro();
		centro2.setNombreCentro("Escuela de francés.");
		centro2.setDireccionCentro("Cristóbal Colón, 92.");
		centro2.setCodigoCentro("EOF");

		// Creamos los objetos "Asignaturas" con el constructor por parámetros: 
		/* Este a diferencia del anterior, tenemos que hacer referencia a los atributos creados por orden*/

		Asignatura asignatura1 = new Asignatura("Inglés B1", 4, "IB1");
		Asignatura asignatura2 = new Asignatura("Inglés B2", 4, "IB2");
		Asignatura asignatura3 = new Asignatura("Francés A2", 4, "FA2");
		Asignatura asignatura4 = new Asignatura("Francés B1", 4, "FB1");

		// Creamos los objetos "alumnos" con el constructor por parámetros: 

		Alumno alumno1 = new Alumno("Ana Abel","Paseo de América, 15.",00001,7.0f, centro1, asignatura1);
		Alumno alumno2 = new Alumno("Benito Bueno","Reyes Católicos, 16.",00002,6.0f, centro1, asignatura2);
		Alumno alumno3 = new Alumno("Carmen Cano","Reyes Católicos, 2.",00003,5.0f, centro1, asignatura1);
		Alumno alumno4 = new Alumno("Esteban Escalera","Isabel la Católica, 28.",00004,9.0f, centro1, asignatura4);
		Alumno alumno5 = new Alumno("Francisco Farfán","Cristóbal Colón, s/n.",00005,8.5f, centro1, asignatura3);
		Alumno alumno6 = new Alumno("Silvia Moyano","Ronda Capuchinos, 17.",00006,7.0f, centro1, asignatura1);

		// Mostrar por pantalla las direcciones de los centros:

		//System.out.println("La dirección de la Escuela de inglés es " +centro1.getDireccionCentro());
		//System.out.println("La dirección de la Escuela de francés es " +centro2.getDireccionCentro());

		// Mostrar por pantalla el nombre del centro en la que está matriculada Carmen:
		//System.out.println("La alumna "+ alumno3.getNombre()+ ", está matriculada en el Centro: "+ alumno3.getCentro().getNombreCentro());

		// Mostrar por pantalla la nota que Benito ha sacado en el B2:
		System.out.println("La nota que ha sacado "+ alumno2.getNombre()+ " en "+ alumno2.getAsignatura().getNombre()+ " es un "+ alumno2.getNota()+ ".");
	}

}
