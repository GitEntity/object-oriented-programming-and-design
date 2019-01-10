/*
 * Devante Wilson - 100554361
 * September 30th, 2015
 * 
 * Program prompts the user for their information in a panel
 * and then prints the output in a message box
 */

// import packages
import javax.swing.JOptionPane;

public class Name 
{
	public static void main(String[] args)
	{
		// declare variables
		String n1, e1;
		
		// prompt user for information in dialog boxes
		n1 = JOptionPane.showInputDialog(null, "What is your name?");
		e1 = JOptionPane.showInputDialog(null, "What is your e-email address?");
		
		// output result in message box
		JOptionPane.showMessageDialog(null, "Hello, " + n1 + "\nYour e-mail is: " + e1);
	}
}
