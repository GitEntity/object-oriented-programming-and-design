/*
 * Devante Wilson - 100554361
 * October 5, 2015
 * 
 * Program designs a tuning circuit for a given frequency.
 * It prints the required inductance value
 * and the range of frequencies to which a circuit
 * can be tuned by varying capacitance
 */

// import packages
import java.util.*;

public class TuningCircuit 
{
	public static void main(String[] args) 
	{
		// declare and initialize variables
		double capacitance = 0,
			capacitanceMin = 0, 
			capacitanceMax = 0, 
			frequency = 0,
			frequencyMin = 0,
			frequencyMax = 0,
			inductance = 0;
		
		Scanner scan = new Scanner(System.in);
		
		// prompt user for values
		System.out.println("Please enter a frequency:");
		frequency = scan.nextDouble();
		
		System.out.println("Please enter a minimum capacitance:");
		capacitanceMin = scan.nextDouble();
		
		System.out.println("Please enter a maximum capacitance:");
		capacitanceMax = scan.nextDouble();
		
		// close Scanner object
		scan.close();
		
		// calculate results
		capacitance = Math.sqrt(capacitanceMin * capacitanceMax);
		inductance = 2 * Math.PI / (Math.pow(frequency, 2) * capacitance);
		frequencyMin = (2 * Math.PI)/(Math.sqrt(inductance * capacitanceMax));
		frequencyMax = (2 * Math.PI)/(Math.sqrt(inductance * capacitanceMin)); 
		
		// output results
		System.out.println("The required inductance is: " + inductance + " H");
		System.out.println("The range of frequencies is from: " + frequencyMin + " Hz to " + frequencyMax + " Hz");
	}
}
