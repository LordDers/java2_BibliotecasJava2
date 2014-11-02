import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;

public class Main2
{
	public static void main (String[] args)
	{
		// Se declara la variable numeros con varios numeros (array)
		int[] numeros = {-2, 5, 1, 9, -6, 20, 6, 0, 16, -10, 12};

		// variable para nuevo valor
		int numero;

		// Creamos el nuevo array, las posiciones que tenia el otro + 1
		int[] numerosnuevos = new int[numeros.length + 1];

		// Creamos el objeto "sc" de tipo Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Introduce un número para añadir al array: ");
		numero = sc.nextInt();

		// Creamos el objeto "fecha" de tipo Date e inicializa el objeto con la fecha y hora actual 
		Date fecha = new Date();

		System.out.println("");

		// Copiamos los valores del antiguo array al nuevo array
		for (int i=0; i < numeros.length; i++)
		{
			numerosnuevos[i] = numeros[i];
		}

		// Añadimos el valor introducido al nuevo array
		numerosnuevos[numerosnuevos.length-1] = numero;

		// Copiamos las direcciones de referencia del antiguo array al nuevo array
		// el valor de la matriz (que es una referencia) se reinicializa con la dirección de la nueva lista de valores
		numeros = numerosnuevos;


		System.out.println("\n Numeros sin ordenar según posición");

		for (int i = 0; i < numeros.length; i++)
		{ 
			System.out.print(numeros[i] + "     "); 
		} 


		// Ordena la matriz especificada de enteros en orden numérico ascendente.
		Arrays.sort(numeros);
		//Arrays.sort(numeros, Collections.reverseOrder());

		System.out.println("\n Numeros ordenados");

		// numeros.length --> Longitud del array (12)
		for (int i = 0; i < numeros.length; i++)
		{ 
			System.out.print(numeros[i] + "     "); 
		}

		System.out.println("");

		// toString() --> Crea la representación canónica de la fecha
		System.out.println("Programa ejecutado el día: " + fecha.toString());


		// System.out.println(numerosnuevos[11]);
	} 
}

// http://www.itcsolutions.eu/2010/12/29/tutorial-java-4-1-how-to-add-a-new-element-to-a-java-array/
