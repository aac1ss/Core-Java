import java.time.*;
import java.util.function.*;

class SupplierDemo{

	public static void main(String[] args) {

//GET DATE AND TIME ALWAYS
		Supplier<LocalDateTime> dateTime= ()-> LocalDateTime.now();
	
		// System.out.println(dateTime.get());
		 printCurrentTimeNow(dateTime);		
	
	}
	public static void printCurrentTimeNow(Supplier<LocalDateTime> dateTime){
	System.out.println(dateTime.get());	
	}
}