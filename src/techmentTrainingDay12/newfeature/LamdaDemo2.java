package techmentTrainingDay12.newfeature;

interface Calculation{
//	void add(int a, int b);
	int add(int a, int b);
}

public class LamdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Calculation calc = (a,b) -> System.out.println("Result :" + (a+b));
//		calc.add(2, 3);
//		calc.add(4, 6);
		
		//single line body no need of return type
		Calculation calc1 = (a,b) -> a+b;
		
		Calculation calc2 = (a,b) ->
		{	if(a>b)
				return a;
			return b;
		};
		
		System.out.println(calc1.add(8, 4));
		System.out.println("largest of the too num" + calc2.add(7, 9));
		
		
	}

}
