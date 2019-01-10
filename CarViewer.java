/**
 * Devante Wilson - 100554361
 * October 29, 2015
 *
 * Program draws two cars in window at specific positions
 * First at the origin (0,0) and the second at a distance of f
 * 
 * CarViewer class specifically runs the program with the main method
 */

// import packages
import javax.swing.JFrame;

public class CarViewer 
{
	public static void main(String[] args) 
	{
		// create new JFrame object
		JFrame frame = new JFrame();
		
		// set frame properties
		frame.setSize(300,400);
		frame.setTitle("Two cars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create new CarComponent object and add to frame
		CarComponent component = new CarComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
