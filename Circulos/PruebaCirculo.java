package studyTool;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaCirculo {

	public static void main(String args[]) {

        // Crea el panel con la entrada del usuario
        Circulo panel = new Circulo ();

        JFrame aplicacion = new JFrame(); // Crea un nuevo objetivo JFrame

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add( panel ); //agrega el panel al marco 
        aplicacion.setSize( 240, 260); //establece el tamaño del marco 
        aplicacion.setVisible( true ); //hace que el marco sea visible 
    }// Fin del main

}// Fin de la clase PruebaFiguras
