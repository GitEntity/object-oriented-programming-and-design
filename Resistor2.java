/**
 * Devante Wilson
 * November 14, 2015
 * 
 * Resistor class - Question 8
 *  
 */

// import package(s)
import java.util.concurrent.ThreadLocalRandom;

public class Resistor2
{
	// define instance variables
	private double nominalResistance, tolerance, actualResistance;
	
	/* constructor:
	 * determines actual resistance value randomly
	 * given nominal resistance and tolerance (+/- 5%)
	 */
	public Resistor2(double nominal, double tolerance)
	{
		// determine actual value randomly
		actualResistance = ThreadLocalRandom.current().nextDouble(
				nominal - (nominal * (tolerance/100.0)), 
				nominal * ((tolerance/100.0) + 1));
	    
	    nominalResistance = nominal;
	    this.tolerance = tolerance;
	}
	
	// Default no parameter constructor
	public Resistor2()
	{
		
	}
	
	// get nominal resistance
	public double getNominal()
	{
		return nominalResistance;
	}
	
	// get resistance tolerance
	public double getTolerance()
	{
		return tolerance;
	}
	
	// get actual resistance
	public double getActual()
	{
		return actualResistance;
	}
}
