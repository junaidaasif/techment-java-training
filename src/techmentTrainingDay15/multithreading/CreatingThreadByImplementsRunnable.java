package techmentTrainingDay15.multithreading;

class Info implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is my task");
	}
	
}

public class CreatingThreadByImplementsRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info info = new Info();
		
		Thread thread = new Thread(info);
		
		thread.start();
	}

}
