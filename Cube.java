/**
 * Devante Wilson
 * November 3, 2015
 * 
 * cube subclass - question 2.
 */

public class Cube extends Geo
{
	public double volume(double h)
	{
		double cuVolume = Math.pow(h, 3);
		return cuVolume;
	}
	
	public double surfaceArea(double h)
	{
		double cuSurface = 6 * Math.pow(h, 2);
		return cuSurface;
	}
	
	// must implement - but not used in this class
	public double volume(double r, double h)
	{
		return 0;
	}
	
	// must implement - but not used in this class
	public double surfaceArea(double r, double h)
	{
		return 0;
	}
}
