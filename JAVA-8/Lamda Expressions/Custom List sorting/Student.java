class Student{
	public Integer id;
	public String name;

	public Student(Integer id,String name){
		this.id=id;
		this.name=name;
	}
	public Integer getId(){
		return id;
	}
	public String toString(){
		return this.id + " : "+ this.name;
	}
}