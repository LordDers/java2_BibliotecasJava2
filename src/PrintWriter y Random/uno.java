import java.io.PrintWriter;
import java.util.Random;

public class uno
{
	public static void main(String[] args)
	{
		char[] c = {'a', 'b', 'c', 'd', 'e', 'r', 's', 'z', 'x', 'i'};
		int numero;


		PrintWriter pw = new PrintWriter(System.out);
		Random randomno = new Random();

		numero = randomno.nextInt(10);

		pw.print(c[numero]);

		pw.flush();

		System.out.println("");
	}
}
