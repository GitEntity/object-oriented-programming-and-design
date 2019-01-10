/**
 * Devante Wilson
 * November 3, 2015
 * 
 * Class implements the java.awt.Rectangle class
 * and supplies methods to compute
 * the area and perimeter of a rectangle
 */

// import rectangle class
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
	// compute rectangle perimeter
	public double getPerimeter()
	{
		double perimeter = 2 * (width + height);
		return perimeter;
	}
	
	// compute rectangle area
	public double getArea()
	{
		double area = width * height;
		return area;
	}
		
	// constructor
	public BetterRectangle(int x, int y, int width, int height)
	{
		// create Rectangle object (invoke constructor of superclass)
		Rectangle rect = new Rectangle();
		
		// set the location of the rectangle
		setLocation(x, y);
		// set the size of the rectangle
		setSize(width, height);
	}
	
	// default no parameter constructor
	public BetterRectangle()
	{
		
	}
}

