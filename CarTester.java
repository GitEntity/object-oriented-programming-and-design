/*
 * Devante Wilson - 100554361
 * October 5, 2015
 * 
 * Program is tester class for Car.java
 */

public class CarTester
{
	public static void main(String[] args) 
	{
		Car myHybrid = new Car (50); // 50 miles per gallon 
		myHybrid.addGas (20); // Tank 20 gallons 
		myHybrid.drive (100); // Drive 100 miles 
		
		// initialize gasLeft
		double gasLeft = myHybrid.getGasInTank();
		
		// print result
		System.out.println(gasLeft);
	}
}
