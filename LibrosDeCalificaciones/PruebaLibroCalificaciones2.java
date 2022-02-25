//Crea y manipula un objeto LibroCalificaciones
package studyTool;
import java.util.Scanner; //el programa usa la clase Scanner

public class PruebaLibroCalificaciones2 {
//el metodo main empieza la ejecuccion del programa
	
	public static void main(String[] args) 
	{
		//crea un objeto Scanner para obtener la entrada de la ventana de comandps
		Scanner entrada = new Scanner(System.in);
		
		//crea un objeto LibroCalificacionoes2 y lo asigna a mi LibroCalificaciones2
		LibroCalificaciones2 miLibroCalificaciones = new LibroCalificaciones2();
		
		//muestra el valor inicial de nombreDelCurso
		System.out.printf("El nombre inicial del curso es: %s\n\n",
				 miLibroCalificaciones.obtenerNombreDelCurso());
	
		//pide y lee el nombre del curso
		System.out.println("Escriba el nombre del curso: ");
		String elNombre = entrada.nextLine();
		miLibroCalificaciones.establecerNombreDelCurso(elNombre);
		System.out.println();
		
		//muestra el mensaje de bienvenida despues de especificar el nombre del curso
		miLibroCalificaciones.mostrarMensaje();
	}
}
