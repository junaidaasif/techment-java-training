package techmentTrainingDay17.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now();
		
		DateTimeFormatter full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter longdate = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter medium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter shortdate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		
		System.out.println(today.format(full));
		System.out.println(today.format(longdate));
		System.out.println(today.format(medium));
		System.out.println(today.format(shortdate));

		
		LocalDateTime todayDateTime = LocalDateTime.now();
		System.out.println("today date time : "+ todayDateTime);
		
		DateTimeFormatter fulltime = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		System.out.println(todayDateTime.format(fulltime));
		
		ZonedDateTime date = ZonedDateTime.now();
		System.out.println(date);
		System.out.println(date.format(fulltime));
		
		
		
	}

}
