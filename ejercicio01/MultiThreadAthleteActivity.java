package ejercicio01;

public class MultiThreadAthleteActivity {
	public static void main(String[] args) throws InterruptedException {
		//Create threads for athletes with their activities durations
		AthleteActivity athlete1 = new AthleteActivity("Michael Jordan", 7);
		AthleteActivity athlete2 = new AthleteActivity("Lebron James", 5);
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
