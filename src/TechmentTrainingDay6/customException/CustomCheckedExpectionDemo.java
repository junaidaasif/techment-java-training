package TechmentTrainingDay6.customException;

class LateException extends Exception{
	public LateException(String msg) {
		super(msg);
	}
}

class Student {
	void login(int time) throws LateException{
		if(time>9)
			throw new LateException("you are absent");
		else
			System.out.println("you are present");

	}
}


public class CustomCheckedExpectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		try {
			student.login(10);
		}
		catch(LateException e){
			System.out.println("Late");
		}
	}

}
