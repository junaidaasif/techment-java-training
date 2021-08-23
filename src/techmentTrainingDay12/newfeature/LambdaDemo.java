package techmentTrainingDay12.newfeature;

interface Bank2{
	void display();
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank2 bank = () ->System.out.println("this is display method");
		
		bank.display();
		
		Bank2 bank2 = () -> 
		{
			System.out.println("this is display method");
			System.out.println("this is multi line body");
			
		};
		bank2.display();
	}

}
