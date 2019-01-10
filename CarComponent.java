/**
 * Devante Wilson - 100554361
 * October 29, 2015
 * 
 * CarComponent draws the two cars
 */

// import packages
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CarComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// create objects and variables
		Graphics2D g2 = (Graphics2D) g;
		
		Car car1 = new Car(0,0);
		
		//int x = getWidth() -  20;
		//int y = getHeight() - 10;
		
		Car car2 = new Car (200,200);
		
		// draw objects to graphics context
		car1.draw(g2);
		car2.draw(g2);
	}
}
