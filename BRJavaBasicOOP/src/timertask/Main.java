package timertask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		
		// Timer = 		A facility for threads to schedule tasks 
		//				for future execution in a background thread
				
		// TimerTask = 	A task that can be scheduled for one-time 
		//				or repeated execution by a Timer
		
		Timer timer = new Timer();
		
		//this timer task is link to the timer when the timer is up
		// it will execute the void run method below
		TimerTask task = new TimerTask() {
			
			int counter = 10;
			
			@Override
			public void run() {
						
				//have a countdown of 10s
				if(counter>0) {
					System.out.println(counter+" seconds");
					counter--;
				}
				else {
					System.out.println("counter ends");
					timer.cancel();
				}
				
				//System.out.println("Task done");
			}
		};
		
		//we can also pass a date not just a time
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR,2021);
		date.set(Calendar.MONTH,Calendar.DECEMBER);
		date.set(Calendar.DAY_OF_MONTH,31);
		date.set(Calendar.HOUR_OF_DAY,23);
		date.set(Calendar.MINUTE,59);
		date.set(Calendar.SECOND,50);
		date.set(Calendar.MILLISECOND,0);
		
		
		//void run is executed in 0 milliseconds
		//1000 = 1 second
		//timer.schedule(task, 0);
		
		//timer.schedule(task, date.getTime()); //executes the calendar date
		//this executes on the date you assigned under the calendar
		
		timer.scheduleAtFixedRate(task, 0, 1000); //counter, no delay because of 0
		
	}

}
