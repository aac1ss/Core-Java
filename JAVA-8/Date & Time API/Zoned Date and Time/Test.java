import java.time.*;
import java.util.*;

class Test{
	public static void main(String[] args) {
// Local Date Time on your machine is displayed
		ZonedDateTime now=ZonedDateTime.now();
		System.out.println(now);
	
		System.out.println("-----------------------------------");

// Custom Local Date on your machine is displayed
		Set<String> avaiZone=ZoneId.getAvailableZoneIds();
		System.out.println(avaiZone);	
		avaiZone.forEach(System.out::println);

		System.out.println("-----------------------------------");

// // Parsed Time
// 		String timeinString="2023-01-11T12:23:32";
// 		LocalDateTime parsedTime=LocalDateTime.parse(timeinString);
// 		System.out.println(parsedTime);		
// 		System.out.println("-----------------------------------");


}
}
