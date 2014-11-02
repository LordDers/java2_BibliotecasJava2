import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class Main
{
	public static void main(String[] args)
	{
		try
		// Como parámetro de BufferedWriter insertaremos un objeto FileWriter, el cuál tendrá como parámetro el nombre del fichero a escribir
		(BufferedWriter bw = new BufferedWriter(new FileWriter("prueba2.txt"));
		// Como parámetro de BufferedReader insertaremos un objeto FileWriter, el cuál tendrá como parámetro el nombre del fichero a leer
		BufferedReader br = new BufferedReader(new FileReader("prueba2.txt"));)
		{
			//Escribimos en el fichero mediante el método "write"
			bw.write("Usando Buffered");
			bw.newLine();
			bw.write("aa");
			//Guardamos los cambios del fichero mediante el método "flush"
			bw.flush();

			//Leemos el fichero y lo mostramos por pantalla mediante el método "readLine" de la clase "BufferedReader"
			String linea = br.readLine();
			while(linea != null)
			{
				System.out.println(linea);
				linea = br.readLine();
			}
		// En caso de haber algún error, saltará el mensaje
		}catch(IOException e)
		{
			System.out.println("Error E/S: "+e);
		}
	}
}
