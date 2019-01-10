/*
 * Devante Wilson - 100554361
 * September 29th, 2015
 * 
 * Program generates a frame that encapsulates a panel with two buttons
 */

// import packages
import java.awt.*;
import javax.swing.*;

// extend JFrame class with Control class
public class Control extends JFrame
{	
	public static void main(String[] args)
	{
		// call new instance of the class (constructor)
		new Control();
	}
	
	// create constructor
	public Control()
	{
		// add buttons to panel and panel to JFrame
		p1.add(btn1);
		p1.add(btn2);
		
		// construct the JFrame x
		JFrame x = new JFrame();
		
		// set JFrame properties
		x.setSize(400,400);
		x.setTitle("Air Traffic Control");
		x.setLocationRelativeTo(null);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setVisible(true);
		
		// add panel to JFrame x
		x.add(p1);
	}
	// construct JPanel
		JPanel p1 = new JPanel();
		
	// construct buttons
	JButton btn1 = new JButton("Add Flight");
	JButton btn2 = new JButton("List Flights");
}
