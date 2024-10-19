import java.util.function.*;

class Main{
	public static void main(String[] args) {
		Predicate<String> predicate=p->p !=null;
		Function<String,Integer>function=f->f.length();
		Consumer<String> consumer=c->System.out.println(c);
		Supplier<String> supplier=()->"BUFF JHOL MOMO";
	String value= supplier.get();

	if (predicate.test(value)) {
		consumer.accept("Length" +function.apply(value));
	}

	}
}