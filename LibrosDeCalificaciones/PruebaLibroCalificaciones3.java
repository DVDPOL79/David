//El constructor de LibroCalificaciones se utiliza para especificar el nombre
// del curso cada vez que se crea cada objeto LibroCalificaciones3
package studyTool;

public class PruebaLibroCalificaciones3 {
	
	
	public static void main(String args[]) {
		//crea un objeto LibroCalificaciones
		LibroCalificaciones3 milibroCalificaciones1 = new LibroCalificaciones3(
				"CS101 Introduccion a la programacion en Java");
		LibroCalificaciones3 milibroCalificaciones2 = new LibroCalificaciones3 (
				"CS102 Estructuras de Datos en Java");
	
	// muestra el valor inicial de nombreDelCurso para cada LibroCalificaciones
		System.out.printf("El nombre del curso de LibroCalificaciones1 es: %s\n",
milibroCalificaciones1.obtenerNombreDelCurso());
		System.out.printf("El nombre del curso de LibroCalificaciones2 es; %s\n", 
				milibroCalificaciones2.obtenerNombreDelCurso());
	
	}
}
