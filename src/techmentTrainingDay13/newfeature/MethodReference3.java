package techmentTrainingDay13.newfeature;

interface Calculate1
{
	int add (int a, int b);
}

class CalculationUtil
{
	int addition(int a, int b)
	{
		return a+b;
	}
	int subtraction(int a, int b)
	{
		return a-b;
	}
}

public class MethodReference3 {

	public static void main(String[] args) {
		
		//By Using Lambda Expression
				Calculate1 cal=(a,b)->a+b;
				System.out.println(cal.add(2, 4));
				
				Calculate1 cal2=(a,b)->a-b;
				System.out.println(cal2.add(9, 4));
				
				//By using Method Reference
				CalculationUtil calculationutil = new CalculationUtil();
				Calculate1 c1= calculationutil::addition;
				Calculate1 c2= calculationutil::subtraction;
				System.out.println(c1.add(2, 6));
				System.out.println(c2.add(11, 7));
				
//				Calculate c3= CalculationUtil::subtraction;
//				c3.add(2, 2); --------->To access using class name we have to make static int subtraction.


	}

}
