import java.time.*;

class Test{
	public static void main(String[] args) {
		
// Local Date on your machine is displayed
		LocalDate dateNow=LocalDate.now();
		System.out.println(dateNow);

		System.out.println("-----------------------------------");
// Custom Local Date on your machine is displayed
		LocalDate custDateNow=LocalDate.of(1990,10,2);
		System.out.println(custDateNow);	

		System.out.println("-----------------------------------");
//Can get various things from LocalDate.now using "Get"
		int year=dateNow.getYear();
		int month=dateNow.getMonthValue();
		Month month2=dateNow.getMonth();
		int day=dateNow.getDayOfMonth();

		System.out.println(year);
		System.out.println(month);
		System.out.println(month2);
		System.out.println(day);

		System.out.println("-----------------------------------");
// To Minus the date and Display
		LocalDate yesterday = dateNow.minusDays(2);
		System.out.println(yesterday);
		System.out.println("-----------------------------------");
	}
}