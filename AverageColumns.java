/**
 * Devante Wilson
 * November 21, 2015
 * 
 * Question 4
 * 
 * Program reads a file containing
 * two columns of floating-point numbers
 * and prints average of each column
 */

// import classes
import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;

public class AverageColumns
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// define new Scanner object
		Scanner in = new Scanner(System.in); 
		
		// prompt user for file name
		System.out.print("Please enter the file name: "); 
		String filename = in.next();
		
		// close Scanner object
		in.close();
		
		// attempt to read from file
		try
		{
			File file = new File(filename);

			if (!file.exists())
				throw new FileNotFoundException();
		} 
		catch (FileNotFoundException e)
		{
			System.err.println("Warning: " + e.getMessage());
		} 
		
		// define variables/objects
		Scanner scan = new Scanner(new File(filename));
		double sum1 = 0, sum2 = 0;
		int count = 0;
		String[] line;
		
		while (scan.hasNextDouble())
		{
			// define array to hold columns
			line = scan.nextLine().split("\\s+"); // one or more whitespaces
			sum1 += Double.parseDouble(line[0]);
			sum2 += Double.parseDouble(line[1]);
			count = line.length;
		}
		
		// print average of column 1
		System.out.println("Average of column 1: " + sum1 / count);
		
		// print average of column 2
		System.out.println("Average of column 2: " + sum2 / count);
		
		// close Scanner object
		scan.close();
	}
}
