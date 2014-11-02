import java.util.TimeZone;

public class Main
{
	public static void main( String args[] )
	{
		// create default time zone object
		TimeZone tz = TimeZone.getDefault(); // 1

		System.out.println("tu zona horaria es " + tz.getDisplayName());

		// checking ID of this time zone   
		System.out.println("zona horaria " + tz.getID()); // 2
	}    
}

// http://www.tutorialspoint.com/java/util/timezone_getdefault.htm
// http://www.tutorialspoint.com/java/util/timezone_getid.htm


// Muestra los ID de la zona
/*import java.util.TimeZone;

public class Main
{
	public static void main( String args[] )
	{       
		// getting available Ids for offset
		String[] availId = TimeZone.getAvailableIDs(3600000);      
		   
		// checking available Ids for offset
		System.out.println("Available Ids for offset are: ");
		for (int i=0; i<availId.length; i++){
			System.out.println(availId[i]);
		}
	}    
}*/

// http://www.tutorialspoint.com/java/util/timezone_getavailableid_offset.htm
