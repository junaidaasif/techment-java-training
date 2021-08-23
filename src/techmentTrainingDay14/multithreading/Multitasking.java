package techmentTrainingDay14.multithreading;

class Sanika extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Sanika :" + i + "msg : welcome to banglore");
		}
	}
}


class Parul extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
//			try {
//				thread.sleep(10000);
//			}
//			catch (){
//				
//			}
			System.out.println("Parul :" + i + "msg : Take vaccination");
		}
	}
}

class Amit extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Amit :" + i + "msg : Covid is not over");
		}
	}
}

public class Multitasking {
	public static void main(String[] args) {
		Sanika sanika = new Sanika();
		Amit amit = new Amit();
		Parul parul = new Parul();
		
//		sanika.run();
//		parul.run();
//		amit.run();
		
		sanika.start();
		parul.start();
		amit.start();
	}
	
}
