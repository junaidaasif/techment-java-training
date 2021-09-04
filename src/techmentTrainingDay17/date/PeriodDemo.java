package techmentTrainingDay17.date; 

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now();
		LocalDate birthdate = LocalDate.of(1989, 11,30);
		
		
		
		Period period = Period.between(today, birthdate);
		
		System.out.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days ");
		
		System.out.println(birthdate.isBefore(today));
	
	
	}
		
}


