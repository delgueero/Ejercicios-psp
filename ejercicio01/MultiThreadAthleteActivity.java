package ejercicio01;

public class MultiThreadAthleteActivity {
	public static void main(String[] args) throws InterruptedException {
		//Create threads for athletes with their activities durations
		AthleteActivity athlete1 = new AthleteActivity("Michael Jordan", 7);
		AthleteActivity athlete2 = new AthleteActivity("Leebron James", 5);
		AthleteActivity athlete3 = new AthleteActivity("Stephen Curry", 2);
		
		//Star the threads
		athlete1.start();
		athlete2.start();
		athlete3.start();
		
		
		Thread.sleep(100);
		//Main thread
		System.out.println("\nAll athletes are training...\n");
	}
}

class AthleteActivity extends Thread {
	private String athlete;
	private int activityDuration; //in seconds
	
	// Constructor accepting pet name and eating time
	public AthleteActivity (String athlete, int activityDuration) {
		this.athlete = athlete;
		this.activityDuration = activityDuration;
	}
	
	@Override
	public void run() {
		System.out.println(athlete + " is doing his activity.");
		try {
			//Simulate the activity duration with sleep
			Thread.sleep(activityDuration * 1000L); //Convert to milliseconds
		} catch (InterruptedException e) {
			System.out.println(athlete + " was interrupted while doing his activity.");
		}
		System.out.println(athlete + " finished doing his activity.");
	}
}