import java.time.*;
import java.util.*;

class Test{
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate then= LocalDate.of(2001,10,29);
		Period period=Period.between(now,then);
		System.out.println(period);
		}	
	}