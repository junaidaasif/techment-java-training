package assignment1;
	import java.util.Scanner;
	public class soldires
	{
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int [] input = new int[100];
			for(int i=1; i<=100; i++) {
				input[i-1] = i;
			}
			System.out.println("enter soldier");
			int sold1 = scan.nextInt();
			int sold2 = scan.nextInt();
			for(int i=sold1; i<=sold2; i++) {
				System.out.println(input[i-1]);
			}

	}
}
