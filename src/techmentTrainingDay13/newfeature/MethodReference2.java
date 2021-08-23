package techmentTrainingDay13.newfeature;


interface Calculate
{
	int add (int a, int b);
}

class Add
{
	int addition(int a, int b)
	{
		return a+b;
	}
}
class Sub
{
	int subtraction(int a, int b)
	{
		return a-b;
	}
}

public class MethodReference2 {

	public static void main(String[] args) {
		
		//By Using Lambda Expression
		Calculate cal=(a,b)->a+b;
		System.out.println(cal.add(2, 4));
		
		Calculate cal2=(a,b)->a-b;
		System.out.println(cal2.add(9, 4));
		
		//By using Method Reference
		Add add= new Add();
		Calculate c1=add ::addition;
		System.out.println(c1.add(3, 7));
		
		Sub sub= new Sub();
		Calculate c2=sub ::subtraction;
		System.out.println(c1.add(14, 6));
	}

}
