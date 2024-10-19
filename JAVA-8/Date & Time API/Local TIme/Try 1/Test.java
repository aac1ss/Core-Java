import java.time.*;

class Test{
	public static void main(String[] args) {
// Local Time on your machine is displayed
		LocalTime timeNow=LocalTime.now();
		System.out.println(timeNow);
	
		System.out.println("-----------------------------------");

// Custom Local Date on your machine is displayed
		LocalTime custTimeNow=LocalTime.of(12,12,12);
		System.out.println(custTimeNow);	

		System.out.println("-----------------------------------");

// Parsed Time
		String timeinString="12:23:32";
		LocalTime parsedTime=LocalTime.parse(timeinString);
		System.out.println(parsedTime);		
		System.out.println("-----------------------------------");

// To Minus the Time and Display
		LocalTime before = timeNow.minusHours(2);
		System.out.println(before);
		System.out.println("-----------------------------------");


//Can get various things from LocalDate.now using "Get"
// 		int year=dateNow.getYear();
// 		int month=dateNow.getMonthValue();
// 		Month month2=dateNow.getMonth();
// 		int day=dateNow.getDayOfMonth();

// 		System.out.println(year);
// 		System.out.println(month);
// 		System.out.println(month2);
// 		System.out.println(day);

// 	}
// }
// // Local Time on your machine is displayed
// 		LocalTime timeNow=LocalTime.now();
// 		System.out.println(timeNow);
	
// 		System.out.println("-----------------------------------");
	}
}