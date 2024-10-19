class Main{
	public static void main(String[] args) {
	Predicate<Integer> predicate=i->i%2==0;
	Function<Integer,Integer> function=	f-> f*2;
	Consumer<Integer> consumer = c-> System.out.println(c);
	Supplier<Integer> supplier=()->100;

if(predicate.test(supplier.get())){
	consumer.accept(function.apply(supplier.get()));
}
	
	}
}