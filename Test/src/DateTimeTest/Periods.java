package DateTimeTest;

import java.time.LocalDate;
import java.time.Period;

public class Periods {
	public static void main(String[] args) {
		LocalDate start =LocalDate.of(2012, 2, 24);
		LocalDate end = LocalDate.of(2012, 4, 23);
		Period period = Period.ofMonths(1);
		
		performAnimal(start, end, period);
		performAnimal(end, start , period);

	}
	private static void performAnimal(LocalDate start, LocalDate end, Period period){
		LocalDate upTo= start;
		while (upTo.isBefore(end));
		System.out.println("give new "+upTo);
		upTo = upTo.plusMonths(1);

	}
}
