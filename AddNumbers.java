/**
This program takes two integers as input from the user
and calculates their sum.

@author Devante Wilson
*/

import java.util.Scanner;

class AddNumbers
{
	public static void main (String[] args)
	{
	Scanner input = new Scanner (System.in);
	int x = 0, y = 0;
	int sum;
	
	System.out.println("First number: ");
	x = input.nextInt();
	System.out.println("Second number: ");
	y = input.nextInt();
	
	sum = x + y;
	
	System.out.println("Result: " + sum);
	}
}
