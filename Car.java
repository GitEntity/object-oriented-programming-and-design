/**
 * Devante Wilson - 100554361
 * October 29, 2015
 *
 * Car class draws the car shape
 */

// import packages
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

// car shape that can be positioned anywhere on the screen
public class Car 
{
	// declare variables
	private int xLeft;
	private int yTop;

	// constructs a car with a given top left corner
	// @param x the x coordinate of the top left corner
	// @param y the y coordinate of the top left corner
	public Car(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}
	
	// draws the car
	// @param g2 the graphics context
	public void draw(Graphics2D g2)
	{
		// body
		Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
		// front tire
		Ellipse2D.Double frontTire
			= new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
		// rear tire
		Ellipse2D.Double rearTire
			= new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);
		
		// bottom of the front windshield
		Point2D.Double r1 = new Point2D.Double(xLeft + 10, yTop + 10);
		// front of the roof
		Point2D.Double r2 = new Point2D.Double(xLeft + 20, yTop);
		// rear of the roof
		Point2D.Double r3 = new Point2D.Double(xLeft + 40, yTop);
		// bottom of the rear windshield
		Point2D.Double r4 = new Point2D.Double(xLeft + 50, yTop + 10);
		
		// entire front windshield
		Line2D.Double frontWindshield = new Line2D.Double(r1,r2);
		// entire roof
		Line2D.Double roofTop = new Line2D.Double(r2,r3);
		// entire rear windshield
		Line2D.Double rearWindshield = new Line2D.Double(r3,r4);
		
		// draw objects to graphics context
		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(frontWindshield);
		g2.draw(roofTop);
		g2.draw(rearWindshield);
	}
}
