package techmentTrainingDay17.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your birthdate");
		String dob = scan.next();
		
//		System.out.println("your birth date : " + dob);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yy/MM/dd"); //to take date and format in java required form
		
		LocalDate birthDate = LocalDate.parse(dob, dtf1);
		System.out.println("Birthdate : " + birthDate); //yy-mm-dd
		
		
	}

}
