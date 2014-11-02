import java.util.Vector;

public class Main
{
	public static void main(String[] args)
	{
		// create an empty Vector vec with an initial capacity of 4      
		Vector<Integer> vec = new Vector<Integer>(4);

		// use add() method to add elements in the vector
		vec.add(4);
		vec.add(3);
		vec.add(2);
		vec.add(1);

		// let us print all the elements available in vector
		System.out.println("Los numeros son "); 
		for (int i = 0; i < vec.size(); i++) // 3
		{
			System.out.println("Numero: " + vec.get(i)); // 2
		}

		System.out.println("");

		// added new number 10 at 3rd position/index
		vec.add(3,10); // 4
		// add new element
		vec.addElement(6); // 5

		for (int i = 0; i < vec.size(); i++)
		{
			System.out.println("Numero: " + vec.get(i));
		}

	}    
}

// http://www.tutorialspoint.com/java/util/vector_add.htm
// http://www.tutorialspoint.com/java/util/vector_get.htm
// http://www.tutorialspoint.com/java/util/vector_size.htm
// http://www.tutorialspoint.com/java/util/vector_add_index.htm
// http://www.tutorialspoint.com/java/util/vector_addelement.htm
