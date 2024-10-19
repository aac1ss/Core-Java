class Book{
	private int id;
	private String name;
	private double price;

	public static boolean valid(Book book) throws BadBookContentException{
		if(book.getId() != 0 && book.getPrice()>0 && book.getName() !=null){
			return true;
		}
		else{
			throw new BadBookContentException("Write a valid id , name or Price of the BooK");
		}
	}

	public void setId(int id){
		this.id=id;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setPrice(double price){
		this.price=price;
	}

	public double getPrice(){
		return price;
	}



}