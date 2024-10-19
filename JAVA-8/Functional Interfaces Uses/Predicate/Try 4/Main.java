import java.util.function.*;

class Main{
	
	public static void main(String[] args) {

	Book b=new Book();
	b.setId(1);
	b.setName("Harrio Puttar");
	b.setPrice(2000.69);

	Predicate<Book> bookIdCheck= chk -> chk.getId() < 0;		
	if (bookIdCheck.test(b)){
		System.out.println("Less than 0");
		}else{
			System.out.println("More than 0");	
		}
	}


	}
