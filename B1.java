/*
 * Devante Wilson - 100554361
 * September 29th, 2015
 * 
 * Program constructs a frame that contains two buttons
 */

// import packages
import java.awt.*;
import javax.swing.*;

class BF extends JFrame
{
	// reference to the button object
	JButton button1, button2;
	
	// constructor for ButtonFrame
	BF (String x)
	{
		// invoke the JFrame constructor
		super(x);
		// set the layout manager
		setLayout (new FlowLayout());
		// construct JButtons
		button1 = new JButton("Click Here!");
		button2 = new JButton("Don't Click Here");
		// add the buttons to the JFrame
		add(button1);
		add(button2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class B1 
{
	public static void main(String[] args) 
	{
		BF f1 = new BF("Lab-2 / Question-3");
			
		f1.setSize(400,300);
		f1.setVisible(true);
	}
}
