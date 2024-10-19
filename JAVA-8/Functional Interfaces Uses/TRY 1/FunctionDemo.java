import java.util.function.Function;

class FunctionDemo{
	public static void main(String[] args){
		Function<Integer,Double> halfValue= i -> i/2.0;
		Double result=halfValue.apply(10);
		System.out.println(result);

		Function<String,String> func1ToUpperCase= String::toUpperCase;
		System.out.println(func1ToUpperCase.apply("zzzzzssaagh"));
		
		Function<String,String> func2nullCheck= str -> str == null ? "enter valid Value":str;
		String value=func2nullCheck.andThen(func1ToUpperCase).apply("this is Asishs");
		System.out.println(value);
		} 

}