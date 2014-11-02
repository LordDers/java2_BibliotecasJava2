import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;

public class Main
{
	public static void main (String[] args)
	{
		// Declaramos la variable numeros como array, la cual tendrá 12 posiciones en memoria (0-11)
		int[] numeros = new int[12];
		//numeros1 = {-2, 5, 1, 9, -6, 20, 6, 0, 16, -10, 12};

		// Damos valor a cada espacio de memoria, exceptuando la última posición
		numeros[0] = -2;
		numeros[1] = 5;
		numeros[2] = 1;
		numeros[3] = 9;
		numeros[4] = -6;
		numeros[5] = 20;
		numeros[6] = 6;
		numeros[7] = 0;
		numeros[8] = 16;
		numeros[9] = -10;
		numeros[10] = -12;

		// Creamos el objeto "sc" de tipo Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Introduce un número para añadir al array: ");
		// Guardamos en la posición 12 (11) el número introducido por teclado
		numeros[11] = sc.nextInt();

		// Creamos el objeto "fecha" de tipo Date e inicializa el objeto con la fecha y hora actual 
		Date fecha = new Date();

		System.out.println("\n Numeros sin ordenar según posición");

		/*for (int i : numeros)
		{
			System.out.print(i + "     ");	
		}*/

		// numeros.length --> Longitud del array (12)
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

	} 


}
