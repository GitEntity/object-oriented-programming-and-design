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
 * Class tests program
 */

// import class
import javax.swing.JFrame;

public class CircleDrawerTest
{
	public static void main(String[] args)
	{
		// define objects
		JFrame frame = new CircleDrawerFrame();
		
		// set frame properties
		frame.setTitle("Question 1 - Circle Drawer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
