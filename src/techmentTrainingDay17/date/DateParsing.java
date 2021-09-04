package techmentTrainingDay17.date;

import java.time.LocalDate;

public class DateParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		System.out.println("==========");
		
		String dob = "15/03/2000";
		String joiningDate = "2020-02-22";
		
		System.out.println("date of birth " +dob);
		System.out.println("joining date " + joiningDate);
		
		System.out.println("=================");
//		parsing joining date
		
		LocalDate joiningDateAfterParse = LocalDate.parse(joiningDate);
		System.out.println(joiningDateAfterParse.getYear());
		System.out.println(joiningDateAfterParse.getMonth());
		
		System.out.println("=========================");
		
		LocalDate date = LocalDate.parse(joiningDate);
		LocalDate birthDate = LocalDate.of(1989, 11, 30);
		
		System.out.println(date);
		System.out.println(birthDate);
		
		
		
		
		
		
		
		
		
	}

}
