import java.util.Random;

public class Main
{
	public static void main( String args[] )
	{
		// create random object
		Random randomno = new Random();
		      
		// get next next boolean value 
		boolean value = randomno.nextBoolean();
		      
		// check the value  
		System.out.println("Value is: " + value);
	}     
}

// http://www.tutorialspoint.com/java/util/random_nextboolean.htm



/*import java.util.Random;

public class Main
{
	public static void main( String args[] )
	{
		// create random object
		Random randomno = new Random();
		 
		// check next int value  			10 --> Numero aleatorio desde 0 a 10
		System.out.println("Next int value: " + randomno.nextInt(10));
	}    
}*/

// http://www.tutorialspoint.com/java/util/random_nextint_inc_exc.htm

