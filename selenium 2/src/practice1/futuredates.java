package practice1;

import java.time.LocalDate;

public class futuredates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalDate d1 = LocalDate.now().plusDays(3);
		System.out.println(d1);
		LocalDate d2 = LocalDate.now().plusMonths(1);
		System.out.println(d2);
		LocalDate d3 = LocalDate.now().plusYears(1);
		System.out.println(d3);

	}

}
