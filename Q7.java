/**
 * Devante Wilosn
 * November 5, 2015
 * 
 * Program generates a sequence of 20 random values from 0-99
 * prints the sequence, sorts it, and prints the sorted sequence.
 */

// import package(s)
import java.util.Random;
import java.util.Arrays;

public class Q7 
{
	public static void main(String[] args) 
	{
		// create variables/objects
		Random randomInt = new Random();
		int[] randomArr = new int[20];
		
		System.out.print("Unsorted: ");
		
		// generate sequence of random integers
		for (int i = 0; i < randomArr.length; i++)
		{
			// store values in array
			randomArr[i] = randomInt.nextInt(100);
			
			// print random sequence
			System.out.print(randomArr[i] + " ");
		}
		
		// sort array
		Arrays.sort(randomArr);
		
		System.out.print("\nSorted: ");
		
		for (int j = 0; j < randomArr.length; j++)
		{
			// print sorted array
			System.out.print(randomArr[j] + " ");
		}
	}
}
