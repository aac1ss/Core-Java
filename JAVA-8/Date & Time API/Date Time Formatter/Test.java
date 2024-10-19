import java.time.*;
import java.util.*;
import java.time.format.*;


class Test{
	public static void main(String[] args) {

		// Default ma Hyphen hucnha Parse ma aru rakhda Exception aucha 
		// So for custom pattern use Formatter for ex / / / , -- -- -- ;

		LocalDate now = LocalDate.parse("2023-03-23");
		DateTimeFormatter myformatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String format=now.format(myformatter);
		System.out.println(format);

		// LocalDate then= LocalDate.of(2001,10,29);
		// Period period=Period.between(now,then);
		// System.out.println(period);
		}	
	}