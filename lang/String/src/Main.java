import java.lang.String;
import java.util.Scanner;

public class Main
{
	public static void main (String[] args)
	{
		String mensaje;
		String mensaje2;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Introduce un texto: ");
		mensaje = sc.next();

		System.out.println("Este es el texto introducido: " + mensaje);

		System.out.print("\n Introduce otro texto: ");
		mensaje2 = sc.next();

		System.out.println("Este es el texto introducido: " + mensaje2);

		// Guarda en "concatenado" el contenido de "mensaje" + "mensaje2"
    		String concatenado = mensaje.concat(mensaje2);
   		System.out.println("\n El texto concatenado es: " + concatenado);

		// Método (charAt) que devuelve el valor del índice especificado (1) de la cadena "mensaje"
		System.out.println("\n Primer valor de la cadena concatenada: " + concatenado.charAt(1));
	}
}
