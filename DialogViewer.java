/**
 * Devante Wilson - 10054361
 * September 17th, 2015
 * 
 * OOP Assignment 1 - Question 5
 * Displays a greeting screen
 */

// import packages
import javax.swing.JOptionPane;

public class DialogViewer 
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Greetings, " + name + "!", "Greeting", JOptionPane.INFORMATION_MESSAGE);
	}
}
