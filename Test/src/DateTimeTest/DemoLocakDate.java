package DateTimeTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DemoLocakDate {

	public static void main(String[] args) {
		LocalDate da1= LocalDate.of(2018, Month.FEBRUARY, 20);
		LocalDate da2= LocalDate.of(2018, 2, 20);
		System.out.println(da1+"\n"+da2);
		LocalTime ti1= LocalTime.of(8, 25, 12, 2000);
		System.out.println(ti1);
		System.out.println("---------------------");
		LocalDateTime dt1= LocalDateTime.of(da1, ti1);
		System.out.println(dt1);
		
		
		
		LocalDate date =  LocalDate.of(2010, Month.JANUARY, 10);
		
				
		

	}

}
