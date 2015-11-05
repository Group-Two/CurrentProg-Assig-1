import java.util.*;

public class ClockThreadTest {

	private static Scanner reader;

	public static void main(String[] args) {
		ClockThread clockThread = new ClockThread();
		clockThread.start();
		reader = new Scanner(System.in);
	    int n = reader.nextInt();
	    while(n!=0) {
	    	n = reader.nextInt();
	    }
	    ClockThread.flag = false;
    	System.out.println("Thread stopped.");
	}
}	

	class ClockThread extends Thread {
		
		static boolean flag = true;
		@Override
		public void run() {
			//super.run();
			int i = 0;
			while (flag) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
					i++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


