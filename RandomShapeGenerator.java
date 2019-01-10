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
import java.awt.Rectangle; 
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D; 
import java.util.Random;

public class RandomShapeGenerator
{
	// declare class variables
	static Random generator;
	static int windowW, windowH;
	
	// constructor
	public RandomShapeGenerator(int w, int h)
	{
		// set random generator
		generator = new Random();
		
		// set window width and height
		windowW = w;
		windowH = h;
	}
	
	/* generate a random shape
	 * @return a shape: rectangle, ellipse, or line
	 */
	public Shape randomShape()
	{
		int s = generator.nextInt(3);	// hold random shape
		int x = generator.nextInt(windowW);	// horizontal boundary is window width
		int y = generator.nextInt(windowH); // vertical boundary is window height
		
		// dimensions of shapes
		final int WIDTH = 20;
		final int HEIGHT = 15;
		
		if (s == 0) // return a rectangle
		{
			return new Rectangle(x, y, WIDTH, HEIGHT);
		}
		else if (s == 1) // return an ellipse
		{
			return new Ellipse2D.Double(x, y, WIDTH, HEIGHT);
		}
		else // return a line
		{
			// compensate for x2, y2, coordinates (as if they were length/width)
			return new Line2D.Double(x, y, x + WIDTH, y + HEIGHT);
		}
	}
}
