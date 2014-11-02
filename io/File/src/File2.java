import java.io.File;

public class File2
{
	public static void main(String[] args)
	{
	      
		File f = null;
		boolean bool = false;
      
		try{
			// create new file
			f = new File("test.txt");
				 
			// tries to create new file in the system
			bool = f.createNewFile();
				 
			// prints
			System.out.println("File created: "+bool);
				 
			// deletes file from the system
			f.delete();
				 
			// delete() is invoked
			System.out.println("delete() method is invoked");
				 
			// tries to create new file in the system
			bool = f.createNewFile();
				 
			// print
			System.out.println("File created: "+bool);
            
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

// http://www.tutorialspoint.com/java/io/file_createnewfile.htm
