import java.util.function.Function;

class func2{
	
	public static void main(String[] args) {

	// ToUpperCase		
		Function<String,String> funcToUpper=String::toUpperCase;
		String result = funcToUpper.apply("this is now Upper case");
		System.out.println(result);

	// ToDouble
		Function<Integer,Double> funToDouble=i->i/2.0;
		Double result2=funToDouble.apply(2);
		System.out.println(result2);

	// Check_Null_changeToUpperCase also andThen-> 1st and then 2nd will be checked
		Function<String,String> funChk= str -> str == null ? "Enter a not null value" : str;
		String val=funChk.andThen(funcToUpper).apply("asdaf");	
		System.out.println(val);

	// Check_Null_changeToUpperCase also compose-> 2nd and then 1st will be checked	
		val=funChk.compose(funcToUpper).apply("hmmm");
		System.out.println(val);	

	// Static Identity()
		Function<Integer,Integer> identicalValue=Function.identity();
		System.out.println(identicalValue.apply(100));
 		
	}
}