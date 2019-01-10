/**
 * Devante Wilson - 100554361
 * October 29, 2015
 * 
 * Viewer for Ellipse demo
 */

// import packages
import javax.swing.JFrame;

public class CViewer 
{
	public static void main(String[] args) 
	{
		// create JFrame object
		JFrame frame = new JFrame ();
		
		// set frame properties
		frame.setSize(200,500);
		frame.setTitle("Lab-3: Drawing an ellipse/circle in a 500x500 frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create Circle100 object and add to frame
		Circle100 component = new Circle100();
		frame.add(component);
		
		// make frame visible
		frame.setVisible(true);
	}
}
