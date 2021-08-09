package assignment1;

import java.util.Scanner;

public class ValidTriangle {
     
    public static void main(String[] args) {
         
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter length of first side of triangle:");
        int a = sn.nextInt();
         
        System.out.println("Enter length of second side of triangle:");
        int b = sn.nextInt();
         
        System.out.println("Enter length of third side of triangle:");
        int c = sn.nextInt();
         
        ValidTriangle vt   = new ValidTriangle();
        if(vt.isTriangleValid(a, b, c)) {
            System.out.println("Sides entered can form a triangle!");
        }else {
            System.out.println("Sides entered cannot form a triangle!");
        }
         
    }
 
  
    private boolean isTriangleValid(int a, int b, int c) {
        if((a+b)>c && (a+c)>b && (b+c)>a) {
            return true;
        }else {
            return false;
        }
    }
}