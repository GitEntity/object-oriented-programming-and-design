/**
 * Devante Wilson
 * November 6, 2015
 * 
 * Class is a tester for Circuit program
 */

public class CircuitTester
{
	public static void main(String[] args)
	{
		// create objects
		Parallel p = new Parallel();
		Serial s = new Serial();
		
		p.add(new Resistor(100));
		s.add(new Resistor(100));
		s.add(new Resistor(200));
		p.add(s);

		// print result
		System.out.println("Combined resistance: " + p.getResistance());
		System.out.println("Expected: 75.0");
	}
}
