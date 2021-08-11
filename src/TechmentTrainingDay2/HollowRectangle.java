package techmentTrainingDay2;

import java.util.Scanner;
public class HollowRectangle {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int row = scan.nextInt();
	
	for(int i=1; i<=row; i++){

        for(int j=1; j<=row; j++){
            if(i==1 || i== row){
                System.out.print("*");
            }
            else if(j==1 || j==row){
          System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
        
 }
	 
	}

}