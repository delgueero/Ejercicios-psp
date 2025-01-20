package ejercicio01;

public class AthleteActivity_Interface implements Runnable {
	private String athlete;
	private int activityDuration; //in seconds
	
	// Constructor accepting pet name and eating time
	public AthleteActivity_Interface (String athlete, int activityDuration) {
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
