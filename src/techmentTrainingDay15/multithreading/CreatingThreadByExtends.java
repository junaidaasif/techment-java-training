package techmentTrainingDay15.multithreading;


class Message extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is my task");
	}
	
}

public class CreatingThreadByExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message message = new Message();
		message.start();
	}

}
