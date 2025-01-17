package ejercicio01;

public class MultiThreadAthleteActivity_Interface {
	public static void main(String[] args) throws InterruptedException {
		//Create threads for athletes with their activities durations
		AthleteActivity_Interface athlete1 = new AthleteActivity_Interface("Michael Jordan", 7);
		AthleteActivity_Interface athlete2 = new AthleteActivity_Interface("Lebron James", 5);
		AthleteActivity_Interface athlete3 = new AthleteActivity_Interface("Stephen Curry", 2);
		
		//Create and start threads
		Thread thread1 = new Thread(athlete1);
		Thread thread2 = new Thread(athlete2);
		Thread thread3 = new Thread(athlete3);

		//Star the threads
		thread1.start();
		thread2.start();
		thread3.start();
		
		//Main thread continues
		Thread.sleep(100);
		System.out.println("\nAll athletes are training...\n");
	}
}
