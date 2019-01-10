/**
 * Devante Wilson - 100554361
 * September 17th, 2015
 * 
 * OOP - Assignment 1 - Question 7
 * Constructs a rectangle object
 * then computes and prints its area
 */

// import packages
import java.awt.Rectangle;

public class AreaTester
{
	public static void main(String[] args)
	{
		// declare and initialize objects and variables
		Rectangle rect = new Rectangle(50,50,10,15);
		double rectWidth = rect.getWidth();
		double rectHeight = rect.getHeight();
		double rectArea = rectWidth * rectHeight;
		
		// output the rectangle's area
		System.out.println("The rectangle's area is: " + rectArea + "\n(Expected area: 150)");
	}
}
