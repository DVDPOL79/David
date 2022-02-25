package studyTool;
//Clase LibroCalificaciones que contiene una variable de instancia nombreDelCurso
// y metodos para establecer y obtener un valor

public class LibroCalificaciones2 
{
	private String nombreDelCurso; // nombre del curso para este LibroCalificaciones
	
		//metodo para establecer el nombre del curso
		public void establecerNombreDelCurso(String nombre)
		{
			nombreDelCurso = nombre; //almacena el nombre del curso
		}	//fin del metodo establecerNombreDelCurso

		//metodo para obtener el nombre del curso
		public String obtenerNombreDelCurso()
		{
			return nombreDelCurso;
		}	//fin del metodo obtenerNombreDelCrso
		
		//muestra un mensaje de bienvenida al usuario de LibroCalificaciones
		public void mostrarMensaje()
		{
			//esta intruccion llama a obtenerNombreDelCurso para obtener el
			//nombre del curso que representa este LibroCalificaciones
			System.out.printf("Bienvenido al libro de calificaciones para\n%s!\n",obtenerNombreDelCurso());
		}	//fin
		
		
}

