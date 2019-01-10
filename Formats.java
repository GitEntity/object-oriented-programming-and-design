/*
 * Devante Wilson - 100554361
 * September 29th, 2015
 * 
 * Program demonstrates the use of the 
 * NumberFormat, SimpleDateFormat, and Calendar classes
 * and their methods to format numbers, times, and dates.
 */

// import packages
import java.text.*;
import java.util.Calendar;

public class Formats 
{
	public static void main(String[] args)
	{
		// declare variables/objects
		NumberFormat numF, currencyF, percentF;
		Calendar cal;
		SimpleDateFormat dateF, timeF;
		
		// initialize variables/objects and output values
		numF = NumberFormat.getNumberInstance();
		System.out.println ("\nNumber: " + numF.format (123456789));
		
		currencyF = NumberFormat.getCurrencyInstance();
		System.out.println ("\nCurrency: " + currencyF.format (1234.90f));
		
		percentF = NumberFormat.getPercentInstance();
		System.out.println ("\nPercent: " + percentF.format (.80f));
		
		cal = Calendar.getInstance();
		dateF = new SimpleDateFormat ("M/d/y");
		
		System.out.println ("\nDate:" + dateF.format (cal.getTime()));
		
		timeF = new SimpleDateFormat ("H:m:s");
		System.out.println ("\nTime: " + timeF.format(cal.getTime()));
	}
}
