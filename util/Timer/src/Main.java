import java.util.Calendar;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
 
public class Main
{
	public static void main(String[] args)
	{
		Timer timer = new Timer();
		Calendar startingTime = Calendar.getInstance(TimeZone.getDefault());
		 
		// Starting at 8:00 AM in every day the Morning
		startingTime.set(Calendar.HOUR_OF_DAY, 13);
		startingTime.set(Calendar.MINUTE, 35);
		startingTime.set(Calendar.SECOND, 30);
		 
		timer.schedule(new TimerTask()
		{
			public void run()
			{
				System.out.println("Se ejecuta todos los dias a las 13:35:30");
			}
			// period 24 hrs (1000 *60 * 60 * 24 mills seconds)
		},
		startingTime.getTime(), 1000 * 60 * 60 * 24);
	}
}

// http://learnertobeginner.blogspot.com.es/2010/07/java-timer-examples.html
