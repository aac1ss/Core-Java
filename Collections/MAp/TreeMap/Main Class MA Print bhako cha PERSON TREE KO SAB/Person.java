class Person{
	private String name;
	private int age;
	
	Person(String nam,int age){
	this.name=nam;
	this.age=age;
	}

	public String getName(){
	return name;
	}

	public int getAge(){
	return age;
	}

	@Override	
	public String toString(){
	return "Name: "+name+" " +"Age: "+age+" "  ;
	}
}	