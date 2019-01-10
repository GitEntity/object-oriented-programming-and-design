/**
 * Devante Wilson
 * November 20, 2015 
 * 
 * Question 1
 * 
 * Program allows user to specify
 * a circle by clicking on the center
 * and typing the radius
 * 
 * Class designs a JFrame
 */

// import classes
import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Dimension;
import javax.swing.JOptionPane;
	
public class CircleDrawerFrame extends JFrame
{
	// specify instance and class variables
	private CircleDrawerComponent component;
	public int radius;
	static final int FRAME_WIDTH = 500, FRAME_HEIGHT= 500;
	
	// constructor
	CircleDrawerFrame()
	{
		component = new CircleDrawerComponent();
		component.setPreferredSize(new Dimension(400,350));
	
		class MousePressListener implements MouseListener
		{
			// determine if mouse was pressed
			public void mousePressed(MouseEvent e) 
			{
				// define variables/objects
				int x = e.getX();
				int y = e.getY();
				String ansRadius = JOptionPane.showInputDialog("Enter radius"); // prompt user
				
				radius = Integer.parseInt(ansRadius); // radius of ellipse
				component.setPositionAndSize(x,y,radius); // positioning
			}
			
			// unaltered methods from MouseListener
			public void mouseClicked(MouseEvent e) {}
	
			public void mouseReleased(MouseEvent e) {}
	
			public void mouseEntered(MouseEvent e) {}
	
			public void mouseExited(MouseEvent e) {}
		}
		
		MousePressListener listener = new MousePressListener(); // new listener object
	    component.addMouseListener(listener); // add listener to component
	    setSize(FRAME_WIDTH, FRAME_HEIGHT);	// set size of frame
	    add(component); // add component to frame
	}
}
