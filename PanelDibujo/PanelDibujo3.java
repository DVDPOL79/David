package studyTool;

import java.awt.Graphics;

import javax.swing.JPanel;


public class PanelDibujo3 extends JPanel {
	public void paintComponent (Graphics g) {

	       //llama a paintComponent para asegurar que el panel se muestre correctamente 

	       super.paintComponent(g);

	       int anchura = getWidth(); //anchura total
	       int altura = getHeight(); //altura total

	       /*
	       //dibuja la linea superior izquierda a la esquina inferior derecha  
	       g.drawLine(0,0,anchura,altura);
	       
	       //dibuja la linea inferior izquierda a la esquina superior derecha  
	       
	       g.drawLine(0,altura,anchura,0);*/
	       
	       //Lado arriba izquierdo
	       g.drawLine(0, 0, 100, 100);
	       g.drawLine(0, 0, 120, 80);
	       g.drawLine(0, 0, 140, 60);
	       g.drawLine(0, 0, 160, 40);
	       g.drawLine(0, 0, 180, 20);
	       g.drawLine(0, 0, 200, 0);
	       g.drawLine(0, 0, 80, 120);
	       g.drawLine(0, 0, 60, 140);
	       g.drawLine(0, 0, 40, 160);
	       g.drawLine(0, 0, 20, 180);
	       g.drawLine(0, 0, 0, 200);


	   } //fin del metodo paintComponent
	}

