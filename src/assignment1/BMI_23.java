package assignment1;
import java.util.Scanner;
public class BMI_23 {
	

	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Input weight in kilogram: ");
	      double weight = sc.nextDouble();
	      System.out.print("\nInput height in meters: ");
	      double height = sc.nextDouble();
	      double BMI = weight / (height * height);
	      System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");

	      if(BMI<18.5) {
	    	  System.out.println("Underweight");
	      }
	      else if(BMI>18.5 && BMI<26) {
	    	  System.out.println("normal");
	      }
	      else if(BMI>25 && BMI<30) {
	    	  System.out.println("overweight");
	      }
	      else {
	    	  System.out.println("Obese`");
	      }
	    	   }
	
}
