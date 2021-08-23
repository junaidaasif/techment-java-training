package techmentTrainingDay15.multithreading;

class Apple extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {			
			System.out.println("eat apple" + Thread.currentThread().getName());
		}
	}
}

class Banana extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
		System.out.println("Eat banana"+  Thread.currentThread().getName());
		}
	}
}

public class ThreadNaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple apple = new Apple();
		Banana banana = new Banana();
		apple.setName("Apple");
		banana.setName("Banana");
		
		apple.setPriority(8);
		banana.setPriority(1);
		apple.start();
		banana.start();
			
	}

}
