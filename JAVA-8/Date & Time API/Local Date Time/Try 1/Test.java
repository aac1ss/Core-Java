import java.time.*;

class Test{
	public static void main(String[] args) {
// Local Date Time on your machine is displayed
		LocalDateTime now=LocalDateTime.now();
		System.out.println(now);
	
		System.out.println("-----------------------------------");

// Custom Local Date on your machine is displayed
		LocalDateTime custDateTimeNow=LocalDateTime.of(2001,10,29,12,11);
		System.out.println(custDateTimeNow);	

		System.out.println("-----------------------------------");

// Parsed Time
		String timeinString="2023-01-11T12:23:32";
		LocalDateTime parsedTime=LocalDateTime.parse(timeinString);
		System.out.println(parsedTime);		
		System.out.println("-----------------------------------");


}
}
