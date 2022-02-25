package studyTool;


public class LibroCalificaciones3 
{
	private String nombreDelCurso; // nombre  del curso para este  LibroCalificaciones
	
	//el constructor inicializa el nombreDelCurso con el objeto Stringque se provee con argumento
	public LibroCalificaciones3 (String nombre)
	{
		nombreDelCurso=nombre; //Inializa el nombre del curso
	}
	
	//metodo para establecer el nombre del curso
	public void establecerNombreDelCurso ( String nombre ) 
	{
		nombreDelCurso=nombre; //almacena el nombre del curso
	}
	
	//metodo para obtener el nombre del curso
	public String obtenerNombreDelCurso() 
	{
		return nombreDelCurso;
	}
	
	//Muestra un mensaje de bienvenida al usuario de LibroCalificaciones
	public void mostrarMensaje() {
		
		System.out.printf("Bienvenido al curso\n%s!\n",obtenerNombreDelCurso());
		
	}
	
}
