package techmentTrainingDay13.newfeature;

interface Calculations //Functional Interface
{
	void display();
}

class Hello
{
	void message()
	{
		System.out.println("Today is Holiday..!!");
	}
}

public class MethodReference1 {

	public static void main(String[] args) {
		
		//lambda expression is used to provide the body implementation
		Calculations calculations=()->System.out.println("This is display method");
		calculations.display();
		
		//By using Method Reference to non static method(Instance Method)
		Hello hello= new Hello();
		Calculations calculations2= hello::message;
		calculations2.display();

	}

}
