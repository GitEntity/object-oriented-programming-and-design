/**
 * Devante Wilson
 * November 3, 2015
 * 
 * Program models a circuit.
 * This subclass models a set of circuits in parallel.
 */

// import package(s)
import java.util.ArrayList;

public class Parallel extends Circuit
{
	// declare new ArrayList
	private ArrayList<Circuit> parallel;
	
	// constructor
	public Parallel()
	{
		parallel = new ArrayList<Circuit>();
	}
	
	// method to add resistors
	public void add(Circuit c)
	{
		parallel.add(c);
	}
	
	// compute combined resistance
	public double getResistance()
	{
		// define variables/objects
		double rTotal = 0, rVal;
		Circuit resist;
		
		for (int a = 0; a < parallel.size(); a++)
		{
			resist = parallel.get(a);	// retrieve arrayList object
			rVal = resist.getResistance();	// call mutator method from Resistor class
			rTotal += 1.0/rVal;
		}
		
		if (rTotal != 0) // prevent divide by 0
			rTotal = 1.0/rTotal;
		
		return rTotal;
	}
}
