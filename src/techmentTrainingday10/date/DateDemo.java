package techmentTrainingday10.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDate birthDate = LocalDate.of(2000,  11, 30);
		System.out.println(dateTime);
	}
}
