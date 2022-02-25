package studyTool;

	import javax.swing.JFrame;

	public class PruebaPanelDibujo2 {

		 public static void main(String []args) {
		        //crea un panel que contiene nuestro dibujo
		        PanelDibujo2 pane2 = new PanelDibujo2();

		        //crea un nuevo marco para contener el panel 
		        JFrame aplicacion = new JFrame();

		        //establece el marco para salir cuando se cierre 
		        aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		        aplicacion.add( pane2 ); //agrega el panel al marco 
		        aplicacion.setSize( 240, 260); //establece el tamaño del marco 
		        aplicacion.setVisible( true ); //hace que el marco sea visible 
		    } // fin del main
	}// fin de la clase main

