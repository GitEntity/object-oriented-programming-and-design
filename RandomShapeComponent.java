/**
 * Devante Wilson
 * November 21, 2015
 * 
 * Question 3
 * 
 * Generates random objects by
 * implementing the Shape interface
 */

// import classes
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import javax.swing.JComponent;

public class RandomShapeComponent extends JComponent 
{
	// draw the random shape
	public void paintComponent(Graphics g) 
	{ 
		// define objects
		Graphics2D g2 = (Graphics2D) g;
		RandomShapeGenerator rsg = new RandomShapeGenerator(getWidth(), getHeight());
		
		// call ten times
		for (int i = 10; i > 0; i--)
		{
			g2.draw(rsg.randomShape());
		}
	}
}
