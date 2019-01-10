/**
 * Devante Wilson
 * November 25, 2015
 * 
 * Question 5
 * 
 * Program teaches arithmetic to a young child.
 * Testing only on addition and subtraction.
 * Generating random problems including 3 levels.
 * 
 * Class creates the game.
 */

// import classes
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class MathGame 
{
	// instance variables
	private Player player; 
	private Scanner in;
	
	// constructor
	public MathGame()
	{
		player = new Player();
		in = new Scanner(System.in);
	}
	
	// play the game
	public void play()
	{
		readPlayerInformation(); 
		String response = ""; 
		boolean done = false; 
		
		while (!done) 
		{ 
			playRound(); 
			System.out.print("Do you want to play again? (Y/N) "); 
			response = in.next(); 
			
			if (!response.equalsIgnoreCase("y")) 
			{
				done = true;
			}
		}
	}
	
	// read user information
	public void readPlayerInformation()
	{
		String name = ""; 
		System.out.print("What is your name? ");
		name = in.next();
		int initialLevel = 0;
		boolean done = false;
		
		while (!done) 
		{
			System.out.print("At what level do you want to start? (1-3) "); 
			
			try 
			{ 
				initialLevel = in.nextInt();
				
				if (initialLevel >= 1 && initialLevel <= 3) 
				{
					done = true;
				}
			}
			catch (InputMismatchException e)
			{
				in.next();	// read the newline character
				System.out.println("Plese, enter a number between a 1 and 3.");
			}
		}
		
		player = new Player(name, initialLevel);
	}
	
	// play one round of the game
	public void playRound()
	{
		int i1 = 0; 
		int i2 = 0; 
		int answer = 0; 
		Random generator = new Random(); 
		
		if (player.getLevel() == 1) 
		{ 
			boolean done = false; 
			
			while (!done) 
			{
				i1 = generator.nextInt(9) + 1; 
				i2 = generator.nextInt(9) + 1; 
				answer = i1 + i2; 
				
				if (answer < 9) 
				{ 
					done = true; 
				} 
			} 
			
			System.out.print("What is " + i1 + " + " + i2 + " ? ");
		} 
		else if (player.getLevel() == 2)
		{
			i1 = generator.nextInt(9) + 1;
			i2 = generator.nextInt(9) + 1;
			answer = i1 + i2; 
			System.out.print("What is " + i1 + " + " + i2 + " ? ");
		}
		
		if (player.getLevel() == 3) 
		{ 
			boolean done = false;
			
			while (!done) 
			{ 
				i1 = generator.nextInt(9) + 1; 
				i2 = generator.nextInt(9) + 1; 
				answer = i2 - i1;
				
				if (answer > 0) 
				{ 
					done = true; 
				} 
			}
			
			System.out.print("What is " + i2 + " - " + i1 + " ? "); 
		} 
		
		System.out.println(getResults(answer)); 
	}
	
	/*
	 * get results of the play.
	 * @param answer the answer
	 * @return the results
	 */
	public String getResults(int answer)
	{
		int guess = getGuess();
		
		if (answer != guess) //Allow a second try. 
		{ 
			System.out .println("Sorry, that is incorrect. Please try one more time.");
			guess = getGuess();
		}
		
		String result = ""; 
		
		if (answer == guess) 
		{ 
			result = "Congratulations, " + player.getName() + "! That is correct."; 
			player.incrementScore(); 
		} 
		else 
		{ 
			result = "Sorry, " + player.getName() + 
					". The correct answer is " + answer; 
		} 
		
		return result;
	}
	
	/*
	 * get the guess from the player
	 * @param the guess from the player.
	 */
	public int getGuess()
	{
		int guess = 0;
		boolean done = false;
		String input = "";
		
		while (!done) 
		{ 
			try 
			{ 
				if (player.getLevel() == 3) 
				{ 
					System.out.print("Please enter the difference: "); 
					guess = in.nextInt(); 
					} 
				else
				{
					System.out.print("Please enter the sum: ");
					guess = in.nextInt();
				}
				
				if (guess > 0)
				{
					done = true;
				}
			}
			catch (InputMismatchException e)
			{
				in.next(); // read the newline character 
				System.out.println("The response must be a number.");
			}
		}
		
		return guess;
	}
}
