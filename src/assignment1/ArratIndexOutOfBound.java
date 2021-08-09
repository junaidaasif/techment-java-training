package assignment1;


import java.util.Scanner;

class ArrayIndexOutOfBound {
   public static void main(String args[]) {
	   Scanner scan = new Scanner(System.in);
	  int num = scan.nextInt();
      int myArray[] = new int[num];
      System.out.println("Please enter the element");
      for(int i=0; i<num; i++) {
    	  myArray[i] = scan.nextInt();
      }
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the index of the required element ::");
      try {
         int element = sc.nextInt();
         System.out.println("Element in the given index is :: "+myArray[element]);
      } catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("The index you have entered is invalid");
         
      }
   }
}