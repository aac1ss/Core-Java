import java.util.*;
import java.util.function.*;

class ConsumerDemo{

// List of Values and to print in Upper Case: 

	public static void main(String[] args) {
	List<String> names=List.of("abc","xyz","ass","jfa");
	Consumer<String> printUpperCase=
							str-> System.out.println(str.toUpperCase());
	printUpperCase.accept("xxxxx");
	names.forEach(printUpperCase);
	
	List<String> newValues=new ArrayList<String>();
	Consumer<String> addToList= str-> newValues.add(str);
	names.forEach(addToList);
	System.out.println(newValues);
	
	}
}