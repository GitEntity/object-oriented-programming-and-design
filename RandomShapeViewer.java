/**
 * Devante Wilson
 * November 21, 2015
 * 
 * Question 3
 * 
 * Generates random objects by
 * implementing the Shape interface
 */

// import class
import javax.swing.JFrame;

public class RandomShapeViewer 
{
	public static void main(String[] args) 
	{ 
		// define objects
		JFrame frame = new JFrame(); 
		RandomShapeComponent component = new RandomShapeComponent();
		
		// set frame properties
		frame.setSize(300, 400);
		frame.setTitle("Random shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.add(component);
		frame.setVisible(true); 
	}
}
