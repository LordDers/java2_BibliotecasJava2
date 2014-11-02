import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main (String[] args)
	{
		// Se declara la variable numeros con varios numeros (array)
		int[] numeros = {-2, 5, 1, 9, -6, 20, 6, 0, 16, -10, 12};
		int numero;

		Scanner sc = new Scanner(System.in);
		System.out.print("\n Numero: ");
		numero = sc.nextInt();
		System.out.println("Numero " + numero);

		int[] numeros1 = {numeros,numero};
		
		// Ordenamos los numeros (sort)
		//Arrays.sort(numeros1);

		/*for (int i : numeros)
		{
			System.out.println(i);	
		}*/

	//	System.out.println(numeros[10]);

	} 


}
