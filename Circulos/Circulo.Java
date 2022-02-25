package studyTool;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Circulo extends JPanel{
	public void paintComponent (Graphics g) {
	         
		super.paintComponent(g);
		
	     g.drawOval(130 , 120 ,15, 15);
	     g.drawOval(125, 115, 25, 25);
	     g.drawOval(120,110,35,35);
	     g.drawOval(115 , 105 ,45, 45);
	     g.drawOval(110, 100, 55, 55);
	     g.drawOval(105,95,65,65);
	     g.drawOval(100 , 90 ,75, 75);
	     g.drawOval(95, 85, 85, 85);
	     g.drawOval(90,80,95,95);
	                    
	            }// Fin del switch
	        } // Fin del for
	
