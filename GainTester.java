/**
 * Devante Wilson
 * November 7, 2015
 * 
 * Class tests the VoltageDivider and Resistor classes.
 * Question 8
 */

public class GainTester
{
	public static void main(String[] args) 
	{
		final int circuitAmount = 10; // amount of voltage dividers
	
		// output actual and nominal gains
		for (int i = 1; i <= circuitAmount; i++)
		{
			Resistor2 r1 = new Resistor2(250, 5);
			Resistor2 r2 = new Resistor2(750, 5);
			VoltageDivider divider = new VoltageDivider(r1, r2);
			
			if (i == 1)
			System.out.print("Nominal Gain (for all Resistors): " + 
					divider.getNominalGain() + " Ohms\n\nActual Gains (Ohms):\n\n");
					
			System.out.printf(i + ": %.4f", divider.getActualGain());
			System.out.print("\n");
		}
	}
}
