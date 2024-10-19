class Laptop {
	
	private String brand;
	private int ram;
	private int price;

	Laptop(){
	}
	Laptop(String brand,int ram,int price){
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}

	public void setBrand(String brand){
		this.brand=brand;
	}
	
	public void setRam(int ram){
		this.ram=ram;
	}

	public  void setPrice(int price){
		this.price=price;
	}


	public String getBrand(){
		return brand;
	}
	
	public int getRam(){
		return ram;
	}

	public int getPrice(){
		return price;
	}

	@Override
	public String toString(){
		return "|"+" "+"Name |"+brand+"\t"+"|"+"Ram |"+ram+"|"+"\t"+"Price| "+price+" \t|";
	}
	
}