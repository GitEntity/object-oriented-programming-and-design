/**
 * Devante Wilson
 * November 3, 2015
 * 
 * cone subclass - question 2.
 */

public class Cone extends Geo
{
	public double volume(double r, double h)
	{
		double coVolume = Math.PI * Math.pow(r, 2) * (h/3.0);
		return coVolume;
	}
	
	public double surfaceArea(double r, double h)
	{
		double coSurface = (Math.PI * r) * (r + Math.sqrt(Math.pow(h,2) + Math.pow(r, 2)));
		return coSurface;
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
