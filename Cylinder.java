/**
 * Devante Wilson
 * November 3, 2015
 * 
 * cylinder subclass - question 2.
 */

public class Cylinder extends Geo
{
	public double volume(double r, double h)
	{
		double cyVolume = Math.PI * Math.pow(r, 2) * h;
		return cyVolume;
	}
	
	public double surfaceArea(double r, double h)
	{
		double cySurface = (2 * Math.PI * r) * (h + r);
		return cySurface;
	}
	
	// must implement - but not used in this class
	public double volume(double x)
	{
		return 0;
	}
	
	// must implement - but not used in this class
	public double surfaceArea(double x)
	{
		return 0;
	}
}
