package ejercicio02;

public class Threads_99 {
    public static void main(String[] args) throws InterruptedException {
        int threadNumber = 99; // Number of threads

        for (int i = 0; i < threadNumber; i++) {
            AthleteActivity_Interface athlete = new AthleteActivity_Interface("Athlete_" + i);
            Thread thread = new Thread(athlete);
            thread.start();
        }

        Thread.sleep(100);
        System.out.println("\nAll athletes are training...\n");
    }
}

class AthleteActivity_Interface implements Runnable {
    private String athlete;
    private static int globalDuration = 0; // Shared counter to track global duration
    private int activityDuration; // Unique duration for each instance (to have a different activity time for each)

    // Constructor accepting athlete name
    public AthleteActivity_Interface(String athlete) {
        this.athlete = athlete;
        globalDuration++; // Increment the global counter
        this.activityDuration = globalDuration; // Assign the current value to this instance
    }

    @Override
    public void run() {
        System.out.println(athlete + " is doing his activity for " + activityDuration + " seconds.");
        try {
            // Simulate the activity duration with sleep
            Thread.sleep(activityDuration * 1000L); // Convert to milliseconds
        } catch (InterruptedException e) {
            System.out.println(athlete + " was interrupted while doing his activity.");
        }
        System.out.println(athlete + " finished doing his activity.");
    }
}
