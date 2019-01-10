/**
 * Devante Wilson
 * November 3, 2015
 * 
 * sphere subclass - question 2.
 */

public class Sphere extends Geo
{
	public double volume(double r)
	{
		double sVolume = (4/3.0) * Math.PI * Math.pow(r, 3); 
		return sVolume;
	}
	
	public double surfaceArea(double r)
	{
		double sSurface = 4 * Math.PI * Math.pow(r, 2);
		return sSurface;
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
