import java.io.FileWriter;

public class Main
{
	public static void main(String[] args)
	{
    
		try
		{
			// Creamos el fichero "prueba.text"
			FileWriter fw=new FileWriter("prueba.txt");

			//Escribimos en el fichero
			fw.write("Texto de prueba \n");

			//Cerramos el stream
			fw.close();
            
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
