import java.util.HashSet;

public class dos
{
	public static void main (String args[])
	{
		// create hash set
		HashSet <String> newset = new HashSet <String>();      
		      
		// populate hash set
		newset.add("Learning"); // 1
		newset.add("Easy");
		newset.add("Simply");  
			    
		// checking elements in hash set
		System.out.println("\nValores: "+ newset);
		System.out.println("Numero: " + newset.size() + "\n"); // 4

		// remove "Easy" from set
		boolean isremoved = newset.remove("Easy"); // 3	true-false
		System.out.println("Valores: "+ newset);
		System.out.println("Numero: " + newset.size() + "\n");

		// clear set values
		newset.clear(); // 2
		System.out.println("Valores: "+ newset);
		System.out.println("Numero: " + newset.size());
	}
}


// http://www.tutorialspoint.com/java/util/hashset_add.htm
// http://www.tutorialspoint.com/java/util/hashset_clear.htm
// http://www.tutorialspoint.com/java/util/hashset_remove.htm
// http://www.tutorialspoint.com/java/util/hashset_size.htm
