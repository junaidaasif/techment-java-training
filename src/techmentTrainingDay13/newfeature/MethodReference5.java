package techmentTrainingDay13.newfeature;

interface LargeNumber
{
	int large(int a, int b, int c);
}

class CalculationUtils
{
	int findLargestNum(int a, int b, int c)
	{
		if(a>b && a>c)
			return a;
		else if(b>c && b>a)
			return b;
		else
			return c;
	}
	
}

public class MethodReference5 {

	public static void main(String[] args) {
		
		LargeNumber largenum=(a,b,c)->{
			if(a>b && a>c)
				return a;
			else if(b>c && b>a)
				return b;
			else
				return c;
		};
		System.out.println(largenum.large(10, 16, 5));
		CalculationUtils calculationutil= new CalculationUtils();
		LargeNumber lnum=calculationutil::findLargestNum;
		System.out.println(lnum.large(23, 34, 10));

	}

}
