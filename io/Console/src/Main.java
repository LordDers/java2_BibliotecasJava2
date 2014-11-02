import java.io.Console;

public class Main
{
	public static void main(String[] args)
	{
	      
		Console cnsl = null;
		String alpha = null;
		  
		// El try se puede comentar    
		try{
			// creates a console object
			cnsl = System.console();

			// if console is not null
			if (cnsl != null)
			{
				    
				// read line from the user input
				alpha = cnsl.readLine("Name: "); // 1
				    
				// prints
				System.out.println("Name is: " + alpha);
				    
				// read password into the char array
				char[] pwd = cnsl.readPassword("Password: "); // 2
				    
				// prints
				System.out.println("Password is: "+pwd);

				String pass= new String (pwd);

				System.out.println("Contraseña en plano: "+pass);
			}      
			}catch(Exception ex)
			{
				// if any error occurs
				ex.printStackTrace();      
			}
	}
}

// http://www.tutorialspoint.com/java/io/console_readline.htm
// http://www.tutorialspoint.com/java/io/console_readpassword.htm
