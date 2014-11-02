import java.lang.Integer;
import java.util.Scanner;

public class Main
{
	public static void main (String[] args)
	{
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Introduce un número: ");
		numero = sc.nextInt();

		System.out.println("Número introducido: " + numero);

		// Este método devuelve el número de bits en una representación binaria
		System.out.println("Número introducido en binario: " + Integer.toBinaryString(numero));
	}
}
