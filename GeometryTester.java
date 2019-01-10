/**
 * Devante Wilson
 * November 3, 2015
 * 
 * Program tests the Geometry and Geo classes
 */

// import packages
import java.util.Scanner;

public class GeometryTester 
{
	public static void main(String[] args) 
	{
		// define variables/objects
		Geometry geo = new Geometry();
		Cube cu = new Cube();
		Sphere s = new Sphere();
		Cylinder cy = new Cylinder();
		Cone co = new Cone();
		Scanner scan = new Scanner(System.in);
		double r = 0, h = 0;
		
		// prompt user for values
		System.out.print("Please enter a radius: ");
		r = scan.nextDouble();
		System.out.print("Please enter a height: ");
		h = scan.nextDouble();
		
		// close Scanner object
		scan.close();
		
		// call methods and print results - from Geometry class
		System.out.printf("Cube volume: %.2f" +
				"\nCube surface area: %.2f" +
				"\nSphere volume: %.2f" +
				"\nSphere surface area: %.2f" +
				"\nCylinder volume: %.2f" +
				"\nCylinder surface area: %.2f" +
				"\nCone volume: %.2f" +
				"\nCone surface: %.2f",
				geo.cubeVolume(h),
				geo.cubeSurface(h),
				geo.sphereVolume(r),
				geo.sphereSurface(r),
				geo.cylinderVolume(r,h),
				geo.cylinderSurface(r,h),
				geo.coneVolume(r, h),
				geo.coneSurface(r,h));
		
		// call methods and print results - from Geo class
		System.out.printf("\n\nCube volume: %.2f" +
				"\nCube surface area: %.2f" +
				"\nSphere volume: %.2f" +
				"\nSphere surface area: %.2f" +
				"\nCylinder volume: %.2f" +
				"\nCylinder surface area: %.2f" +
				"\nCone volume: %.2f" +
				"\nCone surface: %.2f",
				cu.volume(h),
				cu.surfaceArea(h),
				s.volume(r),
				s.surfaceArea(r),
				cy.volume(r,h),
				cy.surfaceArea(r,h),
				co.volume(r, h),
				co.surfaceArea(r,h));
	}
}
