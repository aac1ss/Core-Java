import java.util.function.Function;

class Book{
	private int id;
	private String name;
	private double price;

	// public boolean equals(Object obj){
	// 	Book b= (book) obj;
	// 	return this.getId()==getId();
	// }

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}

	public String getname(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}

public String toString(){
	return "Book: "+id+name+price;
}
}