/**
 * Devante Wilson
 * November 3, 2015
 * 
 * Program models a circuit.
 * This subclass models a series of circuits.
 */

// import package(s)
import java.util.ArrayList;

public class Serial extends Circuit
{
	// define new ArrayList
	ArrayList<Circuit> serial;
	
	// constructor
	public Serial()
	{
		serial = new ArrayList<Circuit>();
	}
	
	// method to add resistors
	public void add(Circuit c)
	{
		serial.add(c);
	}
	
	// compute combined resistance
	public double getResistance()
	{
		double rTotal = 0, rVal;
		Circuit resist;
		
		for (int b = 0; b < serial.size(); b++)
		{
			resist = serial.get(b);	// retrieve arrayList object
			rVal = resist.getResistance();	// call mutator method from Resistor class
			rTotal += rVal;
		}
		
		return rTotal;
	}
}
