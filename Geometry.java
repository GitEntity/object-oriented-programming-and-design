/**
 * Devante Wilson
 * November 2, 2015
 * 
 * Class defines static methods
 * to be utilized by other classes
 */

public class Geometry 
{
	public static double cubeVolume(double h)
	{
		double cuVolume = Math.pow(h, 3);
		return cuVolume;
	}
	
	public static double cubeSurface(double h)
	{
		double cuSurface = 6 * Math.pow(h, 2);
		return cuSurface;
	}
	
	public static double sphereVolume(double r)
	{
		double sVolume = (4/3.0) * Math.PI * Math.pow(r, 3); 
		return sVolume;
	}
	
	public static double sphereSurface(double r)
	{
		double sSurface = 4 * Math.PI * Math.pow(r, 2);
		return sSurface;
	}
	
	public static double cylinderVolume(double r, double h)
	{
		double cyVolume = Math.PI * Math.pow(r, 2) * h;
		return cyVolume;
	}
	
	public static double cylinderSurface(double r, double h)
	{
		double cySurface = (2 * Math.PI * r) * (h + r);
		return cySurface;
	}
	
	public static double coneVolume(double r, double h)
	{
		double coVolume = Math.PI * Math.pow(r, 2) * (h/3.0);
		return coVolume;
	}
	
	public static double coneSurface(double r, double h)
	{
		double coSurface = (Math.PI * r) * (r + Math.sqrt(Math.pow(h,2) + Math.pow(r, 2)));
		return coSurface;
	}
}
