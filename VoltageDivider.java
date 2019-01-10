/**
 * Devante Wilson
 * November 6, 2015
 * 
 * Class provides the nominal and actual values
 * for the voltage divider's gain.
 */

public class VoltageDivider 
{
	// instance variables
	private Resistor2 r1, r2;
	
	/* constructor:
	 * accepts two Resistor objects,
	 * nominal resistance and resistor tolerance.
	 */
	public VoltageDivider(Resistor2 r1, Resistor2 r2)
	{
		this.r1 = r1;
		this.r2 = r2;
	}
	
	// retrieve nominal value of voltage divider's gain
	public double getNominalGain()
	{
		return r1.getNominal()/(r1.getNominal() + r2.getNominal());
	}
	
	// retrieve actual value of voltage divider's gain
	public double getActualGain()
	{
		return r1.getActual()/(r1.getActual() + r2.getActual());
	}
	
	// default no parameter constructor
	public VoltageDivider()
	{
		
	}
}
