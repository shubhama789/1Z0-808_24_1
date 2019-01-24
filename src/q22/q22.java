package q22;

import java.time.LocalDate;

public class q22 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2012,01,32);
		date.plusDays(10);
		System.out.println(date);
	}
}
