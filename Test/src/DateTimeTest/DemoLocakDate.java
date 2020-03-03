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
		
		System.out.println("********************");
		
		LocalDate date =  LocalDate.of(2010, Month.JANUARY, 10);
		System.out.println(date);
		date = date.minusDays(5);
		System.out.println(date);
		date = date.plusDays(20);
		System.out.println(date);
		date = date.plusMonths(15);
		System.out.println(date);
		date =date.plusYears(4);
		System.out.println(date);
		
		
		System.out.println("+++++++++++++++++++");
		
		LocalDate datet1 =  LocalDate.of(2010, Month.JANUARY, 10);
		LocalTime time1 =LocalTime.of(12, 12);
		LocalDateTime datetime= LocalDateTime.of(datet1, time1);
		System.out.println(datetime);
		datetime = datetime.minusHours(2);
		System.out.println(datetime);
		datetime = datetime.plusMinutes(300);
		System.out.println(datetime);
		datetime = datetime.plusMonths(15);
		System.out.println(datetime);
		datetime =datetime.plusSeconds(2000000);
		System.out.println(datetime);
		
	}

}
