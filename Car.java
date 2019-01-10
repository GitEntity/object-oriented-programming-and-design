/*
 * Devante Wilson - 100554361
 * October 5, 2015
 * 
 * Program models a car's fuel usage
 */

public class Car 
{
	// declare variables/objects
	double gasLeft, efficiency, distance, spentGas;
	double initialGas = 0;
	
	// constructor - specifies fuel efficiency
	public Car(int e)
	{
		this.efficiency = e;
	}
	
	/* method simulates driving the car for certain distance,
	   reducing the amount of gasoline in the fuel tank.*/
	public void drive(double distance)
	{
		spentGas = distance / efficiency;
	}

	// method returns the current amount of gasoline in the fuel tank
	public double getGasInTank()
	{
		gasLeft = initialGas - (distance/efficiency);
		return gasLeft;
	}
	
	// adds gasoline in the tank
	public void addGas(double a)
	{
		this.initialGas = a;
	}
		
	public static void main(String[] args) 
	{

	}
}
