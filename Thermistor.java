/*
 * Devante Wilson - 100554361
 * October 10, 2015
 * 
 * Program calculates the liquid temperature of liquid
 * contained in copper pipes based on a thermistor.
 */

//import packages
import java.util.Scanner;

public class Thermistor 
{
	public static void main(String[] args)
	{
		// declare/initialize variables
		Scanner scan = new Scanner(System.in);
		final int R_NAUGHT = 1075; // ohms
		final int T_NAUGHT = 85; // celsius
		final int BETA = 3696; // 3969 kelvin -> celsius (-273)
		double resistance = 0, liquidTemp = 0;
		
		//prompt user for resistance
		System.out.println("Please enter the thermistor resistance (in ohms):");
		resistance = scan.nextDouble();
		
		// close Scanner object
		scan.close();
		
		// calculate results
		liquidTemp = (BETA*T_NAUGHT)/(T_NAUGHT*Math.log(resistance/R_NAUGHT)+BETA);
		
		//output result
		System.out.println("The liquid temperature in degrees C is: " + liquidTemp);
	}
}
