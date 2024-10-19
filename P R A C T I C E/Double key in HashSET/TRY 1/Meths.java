import java.util.*;
class Meths{

	public void hashSet(){


		HashSet<Book> book= new HashSet<>();
		book.add(new Book(1,"Khai",1200));
		book.add(new Book(3,"Khai3",2200));
		book.add(new Book(4,"Khai5",200));
		book.add(new Book(4,"Khai4",100));
		book.add(new Book(2,"Khai2",120));

		for(Book r:book){
		System.out.println(r);
		}
	}


}