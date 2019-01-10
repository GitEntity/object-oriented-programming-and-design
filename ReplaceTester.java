/**
 * Devante Wilson - 100554361
 * September 17th, 2015
 * 
 * OOP - Assignment 1 - Question 8
 * Program encodes a string by replacing all letters
 * "i" with "!" and "s" with "$"
 * then outputs both the results
 */

//import packages
import java.io.*;

public class ReplaceTester 
{
	public static void main(String[] args)
	{
		// declare and initialize object
		String word = new String("Mississippi");
		
		// modify string
		word = word.replace('i', '!');
		word = word.replace('s','$');
		
		// output result
		System.out.println("New string: " + word + "\n(Expected result: M!$$!$$!pp!)");
	}
}
