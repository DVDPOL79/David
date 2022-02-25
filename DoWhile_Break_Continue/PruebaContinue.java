package studyTool;
// instrucción continue para terminar una iteración de una instrucción for.
public class PruebaContinue {

	public static void main(String[] args) {
		
		for ( int cuenta = 1; cuenta <= 10; cuenta++ ) // itera 10 veces
		{
			if ( cuenta == 5 ) // si cuenta es 5,
				continue; // omite el resto del codigo en el ciclo
			
			System.out.printf( "%d ", cuenta );
		} // fin de for
		
		System.out.println("\nSe uso continue para omitir imprimir 5" );

	} // fin de main

} // fin de la clase PruebaContinue
