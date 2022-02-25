//crea un objeto LibroCalificaciones y pasa un objeto String
// a su metodo mostrar mensaje 

package studyTool;
import java.util.Scanner;//el programa usa la clase scanner
public class PruebaLibroCalificaciones1 
{
//el metodo main empieza la ejecuccion del programa
	public static void main(String[] args) 
	{
		// crea un objeto Scanner para obtener ls entrada de la ventana de comando
		Scanner entrada = new Scanner (System.in);
		
		//crea un objeto Libro calificaciones y lo asigna a miLibroCalificaciones
		LibroCalificaciones1 miLibroCalificaciones = new LibroCalificaciones1();

		//pide y ecibe el nombre del curso com entrada
		System.out.println("Escriba el  nombre del curso:");
		String nombreDelCurso = entrada.nextLine(); //lee una linea del texto
		System.out.println(); //imprime una linea en blanco
		
		// llama al metodo mostrarMensaje de miLibroCalificaciones 
		// y pasa nombreDelCurso como <argumento
		miLibroCalificaciones.mostrarmensaje1(nombreDelCurso);
	}	// fin de main

} //fin de la clase PruebaLibroCalificaciones

