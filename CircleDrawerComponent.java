/**
 * Devante Wilson
 * November 21, 2015 
 * 
 * Question 1
 * 
 * Program allows user to specify
 * a circle by clicking on the center
 * and typing the radius
 * 
 * Class designs a JComponent for frame
 */

// import classes
import java.awt.Color;
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import javax.swing.JComponent; 

import java.awt.geom.Ellipse2D;

public class CircleDrawerComponent extends JComponent
{
	// specify instance variables
	private int x, y, radius;
	
	// mutator method
	public void setPositionAndSize(int x, int y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// draw the circle
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double ellipse 
			= new Ellipse2D.Double(x - radius, y - radius, radius * 2, radius * 2);
		
		// set color
		g2.setColor(Color.red);
		 // draw onto graphics context
		g2.draw(ellipse);
		
		// call repaint as visual properties were altered
		repaint();
	}
	
	// default no parameter constructor
	public CircleDrawerComponent()
	{
		
	}
}
