package techmentTrainingDay13.newfeature;

interface A
{
	Student getStudentDetails();
}

class Student
{
	int id;
	String name;
	void display()
	{
		System.out.println("This is Student Info");
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		
		//by using lambda expression multiline
		A a=()-> {
		Student s= new Student();
		return s;
		};
		a.getStudentDetails().display();
		
		//by using lambda single line
		A a1=()->new Student();
		a1.getStudentDetails();
		
		//By using method reference
		 A obj =Student ::new;
		 obj.getStudentDetails().display();

	}

}
