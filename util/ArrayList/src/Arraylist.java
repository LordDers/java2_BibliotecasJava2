import java.util.ArrayList;

public class Arraylist
{
	public static void main (String args[])
	{
		ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

		// use add() method to add elements in the list
		arrlist.add(15); // 1
		arrlist.add(20);
		arrlist.add(25);
			  
		// let us print all the elements available in list
		/*for (Integer number : arrlist)
		{
			System.out.println("Numbero: " + number);
		}*/

		for (int i = 0; i<arrlist.size(); i++)
		{
			System.out.println("Numero: " + arrlist.get(i)); // 4
		}

		// list does not contain element 6
		boolean retval2 = arrlist.contains(6); // 3

		if (retval2 == true)
		{
			System.out.println("El numero 6 esta en la lista");
		}
		else
		{
			System.out.println("El numero 6 no esta en la lista");    
		}

		System.out.println("\n");
		// adding element 25 at third position
		arrlist.add(2,6); // 2
		boolean retval3 = arrlist.contains(6);

		// Removes element at 4rd position
		arrlist.remove(3); // 6

		for (int i = 0; i<arrlist.size(); i++)
		{
			System.out.println("Numero: " + arrlist.get(i));
		}

		if (retval3 == true)
		{
			System.out.println("El numero 6 esta en la lista");
		}
		else
		{
			System.out.println("El numero 6 no esta en la lista");    
		}

		// retrieving the index of element "E"
		int retval=arrlist.indexOf(6); // 5
		System.out.println("El numero 6 esta en la posicion: " + retval);
	}
}



// http://www.tutorialspoint.com/java/util/arraylist_add.htm
// http://www.tutorialspoint.com/java/util/arraylist_add_index.htm
// http://www.tutorialspoint.com/java/util/arraylist_contains.htm
// http://www.tutorialspoint.com/java/util/arraylist_get.htm
// http://www.tutorialspoint.com/java/util/arraylist_indexof.htm
// http://www.tutorialspoint.com/java/util/arraylist_remove.htm
