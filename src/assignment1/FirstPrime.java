package assignment1;

import java.util.Scanner;



public class FirstPrime {
	
	boolean isPrime(int n) {
		int count = 0;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 int  i,n,p,count,flag;
 
 	 System.out.println("Enter the number of prime terms you want!");
     n=sc.nextInt();
     
     for(i=2; i<=n; i++) {
    	boolean c = new FirstPrime().isPrime(i);
    	
    	 if(c) {
    		 System.out.println(i);
    	 }
     }
     
     
//     p=2;
//         i=1; 
//         	while(i<=n)
//         {
//             flag=1;
//             for(count=2;count<=p-1;count++)
//             {
//                 if(p%count==0)  //Will be true if p is not prime
//                 {
//                  flag=0;
//                  break;      //Loop will terminate if p is not prime
//                 } 
//             }
//                 if(flag==1)
//                 {
//                   System.out.print(p+" ") ;
//                  i++;
//                 }
//             p++;
//         }
     }
}