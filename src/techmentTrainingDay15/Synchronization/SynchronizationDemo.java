package techmentTrainingDay15.Synchronization;

class Water {
	public void drinkWater(int time) {
		synchronized(this) {
	
		for(int i=0; i<=time; i++) {
			System.out.println(Thread.currentThread().getName() + "Drinkning water" + i + "Times");
			}
			
		}
		
		for(int i=0; i<=time; i++) {
			System.out.println(Thread.currentThread().getName() + " eating " + i + "Times");
		}
		
		
	}
}

class WaterBotle extends Thread{
	Water water = new Water();
	
	public void run() {
		water.drinkWater(5);
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterBotle waterbotle = new WaterBotle();
		
		Thread person1 = new Thread(waterbotle);
		Thread person2 = new Thread(waterbotle);
		Thread person3 = new Thread(waterbotle);
		
		person1.start();
		person2.start();
		person3.start();
		
		person1.setName("amit");
		person2.setName("junaid");
		person3.setName("aashu");
	}

}
