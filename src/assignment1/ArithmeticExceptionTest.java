package assignment1;
import java.util.Scanner;

public class ArithmeticExceptionTest {
   public static void main(String[] args) {
	   int add=0;
     Scanner scan = new Scanner(System.in);
     int a = scan.nextInt();
     int b = scan.nextInt();
    
      try {
    	  
         add = b/a;
      } catch (ArithmeticException e) {
         e.printStackTrace();
         System.out.println("Cannot divide by zero");
      }
      finally {
          
          System.out.println("executed");
          
      }
      System.out.println(add);
      
   }
}