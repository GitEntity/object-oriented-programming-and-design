/**
 * Devante Wilson - 100554361
 * September 17th, 2015
 * 
 * OOP - Assignment 1 - Question 6
 * Displays a UOIT greeting screen
 */

// import packages
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
	public static void main(String[] args) throws Exception
	{
		// fetch icon location
		URL imageLocation = new URL ("http://i.imgur.com/CilzIQZ.gif");
		
		// create dialog box
		JOptionPane.showMessageDialog(null, 
				"Welcome back to school!", 
				"Greeting", 
				JOptionPane.PLAIN_MESSAGE, 
				new ImageIcon(imageLocation));
	}
}
