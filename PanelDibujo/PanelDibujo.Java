package studyTool;
//Uso de drawLine para conectar las esquinas de un panel
import java.awt.Graphics;
import javax.swing.Panel;

public class PanelDibujo extends Jpanel
{
// dibuja una x desde las esquinas del panel
public void paintComponent( Graphics g )
{
	// llama a paintcomponent para asegurar que el panel se muestre correctamente
	super.paintComponent( g );

	int anchura = getWidht(); // anchura Total
	int altura = getHeight(); // altura total

	// dibuja una linea de la esquina inferior izquierda a la esquina inferior derecha
	g.drawline( 0, o, anchura, altura );
	
	// dibuja una linea de la esquina inferior izquierda a la esquina superior derecha
	g.drawline( 0, altura, anchura, 0);



}



}
