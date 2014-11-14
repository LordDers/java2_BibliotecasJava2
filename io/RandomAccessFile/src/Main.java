import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			// Creamos un RandomAccessFile con el nombre del fichero
			RandomAccessFile raf = new RandomAccessFile("prueba2.txt", "rw");

			// Escribimos en el fichero
			raf.writeUTF("Escribiendo en el fichero");

			// Posicionamos la posición del puntero en el índice 0
			raf.seek(0);

			// Imprimimos la línea
			System.out.println("" + raf.readLine());

			// Posicionamos la posición del puntero en el índice 0
			raf.seek(0);

			// Escribimos en el fichero
			raf.writeUTF("Probando \n Hola\n");

			raf.seek(0);
			// Imprimimos la línea
			System.out.println("" + raf.readLine());
			} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}

// http://www.tutorialspoint.com/java/io/randomaccessfile_readline.htm
