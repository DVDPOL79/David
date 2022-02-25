package studyTool;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelDibujo2 extends JPanel {
	
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
	       g.drawLine(0,0,20,200);
	       g.drawLine(0,0,40,180);
	       g.drawLine(0,0,60,160);
	       g.drawLine(0,0,80,140);
	       g.drawLine(0,0,100,120);
	       g.drawLine(0,0,120,100);
	       g.drawLine(0,0,140,80);
	       g.drawLine(0,0,160,60);
	       g.drawLine(0,0,180,40);
	       g.drawLine(0,0,200,20);

	       
	       //Lado abajo izquierdo
	       g.drawLine(20,20,0,anchura);
	       g.drawLine(40,40,0,anchura);
	       g.drawLine(60,60,0,anchura);
	       g.drawLine(80,80,0,anchura);
	       g.drawLine(100,100,0,anchura);
	       g.drawLine(120,120,0,anchura);
	       g.drawLine(140,140,0,anchura);
	       g.drawLine(160,160,0,anchura);
	       g.drawLine(180,180,0,anchura);
	       g.drawLine(200,200,0,anchura);

	       //Lado abajo derecho
	       g.drawLine(altura,anchura,20,200);
	       g.drawLine(altura,anchura,40,180);
	       g.drawLine(altura,anchura,60,160);
	       g.drawLine(altura,anchura,80,140);
	       g.drawLine(altura,anchura,100,120);
	       g.drawLine(altura,anchura,120,100);
	       g.drawLine(altura,anchura,140,80);
	       g.drawLine(altura,anchura,160,60);
	       g.drawLine(altura,anchura,180,40);
	       g.drawLine(altura,anchura,200,20);

	       //Lado arriba derecho
	       g.drawLine(20,20,altura,0);
	       g.drawLine(40,40,altura,0);
	       g.drawLine(60,60,altura,0);
	       g.drawLine(80,80,altura,0);
	       g.drawLine(100,100,altura,0);
	       g.drawLine(120,120,altura,0);
	       g.drawLine(140,140,altura,0);
	       g.drawLine(160,160,altura,0);
	       g.drawLine(180,180,altura,0);
	       g.drawLine(200,200,altura,0);

	   } //fin del metodo paintComponent
	}