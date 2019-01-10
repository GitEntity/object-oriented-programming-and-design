/**
 * Devante Wilson - 100554361
 * October 29, 2015
 * 
 * Program fills window with a circle graphic
 */

// import packages
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

// This component draws an ellipse tied to the component boundary
public class Circle100 extends JComponent
{
	// Paints the ellipse
	// @param g the graphics context
	public void paintComponent(Graphics g)
	{
		// create objects
		// cast Graphics object as Graphics2D object
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double ellipse = new Ellipse2D.Double(0,0,getWidth(),getWidth());
		
		g2.setColor(Color.BLUE);
		//g2.fill(ellipse);
		g2.setColor(Color.BLACK);
		g2.draw(ellipse);
	}
}
