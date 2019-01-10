/**
 * Devante Wilson
 * November 25, 2015
 * 
 * Question 5
 * 
 * Class acts as a player
 * for the math game
 */

public class Player 
{
	// instance variables
	private String name;
	private int score;
	private int level;
	
	// constructor
	public Player()
	{
		name = ""; 
		score = 0; 
		level = 1;
	}
	
	/* construct a Player object 
	 * with the player's name and initial level. 
	 * @param playerName the player's name 
	 * @param initialLevel the initial level 
	 */ 
	public Player(String playerName, int initialLevel) 
	{ 
		name = playerName;
		score = 0; 
		level = initialLevel; 
	} 
	
	// increment the player's score.
	public void incrementScore() 
	{ 
		score++; 
		
		if (score % 5 == 0 && level < 3) 
		{ 
			level++; 
		} 
	} 
	
	/* get the current level. 
	 * @return level the current level
	 */
	public int getLevel()
	{
		return level;
	}
	
	/*
	 * get the name of the player.
	 * @return name the name of the player;
	 */
	public String getName()
	{
		return name;
	}
}
