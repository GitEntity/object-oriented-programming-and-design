/**
 * Devante Wilson
 * November 3, 2015
 * 
 * Class tests the BetterRectangle class
 */

// import package(s)
import java.util.Scanner;
import java.awt.Rectangle;

public class BetterRectangleTester 
{
	public static void main(String[] args) 
	{
		// define variables/objects
		Scanner scan = new Scanner(System.in);
		int width = 0, height = 0, x = 0, y = 0;
		BetterRectangle rect;
		
		// prompt user for rectangle information
		System.out.print("Enter rectangle width: ");
		width = scan.nextInt();
		System.out.print("Enter rectangle height: ");
		height = scan.nextInt();
		System.out.print("Enter rectangle position x: ");
		x = scan.nextInt();
		System.out.print("Enter rectangle position y ");
		y = scan.nextInt();
		
		rect = new BetterRectangle(x,y,width,height);
		
		// call methods and print results
		System.out.printf("Rectangle perimeter: %.2f", rect.getPerimeter());
		System.out.printf("\nRectangle area: %.2f", rect.getArea());
		rect.setSize(width, height);
		rect.setLocation(x,y);
		System.out.println("\n" + rect.getSize());
		System.out.println(rect.getLocation());
	}
}