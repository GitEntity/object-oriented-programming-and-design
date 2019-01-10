/**
 * Devante Wilson
 * November 3, 2015
 * 
 * Program models a circuit.
 * This subclass represents a single resistor.
 */

public class Resistor extends Circuit
{
	// class variable
	private double resistance;
	
	// constructor/mutator method
	public Resistor(double r)
	{
		resistance = r;
	}
	
	// accessor method
	public double getResistance()
	{
		return resistance;
	}
}
