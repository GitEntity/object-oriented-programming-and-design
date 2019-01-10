/**
 * Devante Wilson
 * November 15, 2015
 * 
 * Question 3
 * Abstract class Animal
 */

public abstract class Animal 
{
	// instance variables
	private String name;
	
	// abstract method
	public abstract void speak();
	
	// accessor method
	public String getName()
	{
		return name;
	}
	
	// mutator method
	public void setName(String animalName)
	{
		name = animalName;
	}
}
