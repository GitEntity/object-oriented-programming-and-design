/**
 * Devante Wilson
 * November 15, 2015
 * 
 * Tester class for Animal
 */

public class UseAnimal
{
	public static void main (String[] args)
	{
		// define objects
		Dog myDog = new Dog ();
		Cow myCow = new Cow ();
		
		// call methods and print results
		myDog.setName("Murphy");
		myCow.setName("Elsie");
		
		System.out.print(myDog.getName() + " says ");
		myDog.speak();
		System.out.print(myCow.getName() + " says ");
		myCow.speak();
	}
}