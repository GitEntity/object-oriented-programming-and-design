/*
 * Devante Wilson - 100554361
 * October 5, 2015
 * 
 * Program models a door object
 */

public class Door 
{
	// declare objects/variables
	private String name, state;
	
	// state method
	public void close()
	{
		state = "close";
	}
	
	// state method
	public void open()
	{
		state = "open";
	}
	
	// constructor for Door class
	public Door(String name,String state)
	{
		
	}
	
	// accessor method for door name
	public String getName()
	{
		return name;
	}
	
	// accessor method for door state
	public String getState()
	{
		return state;
	}
	
	// mutator method for door name
	public void setName(String newName)
	{
		name = newName;
	}
	
	// mutator method for door state
	public void setState(String newState)
	{
		state = newState;
	}
	
	public static void main(String[] args)
	{

	}
}
