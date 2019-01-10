/**
 * Devante Wilson
 * November 5, 2015
 * 
 * Program computes the alternating sum of an array's elements.
 * (Operator switches from - to + between each element)
 */

// import package
import java.util.Arrays;

public class Q6
{	
	static int alternatingSum(int[] arr)
	{
		int sum = 0;
		
		// calculute alternating sum
		for (int a = 0; a < arr.length; a+=2)
			sum += arr[a];
		
		for (int b = 1; b < arr.length; b+=2)
			sum -= arr[b];
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		// define array
	    int[] sumArr = {1,4,9,16,9,7,4,9,11};
		
		// call method and print result
		System.out.print("Array: " + Arrays.toString(sumArr) + 
				"\nAlternating sum: " + alternatingSum(sumArr) +
				"\nExpected: -2");
	}
}
