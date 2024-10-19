class A implements Comparable<A>{
	
	private Integer num;
	private String str;

	A(int num,String str){
		this.num = num;
		this.str = str;
	}

	public int getNum(){
		return num;
	}

	public String getstr(){
		return str;
	}
	
	//For Sorted Set Interface
	@Override
    public int compareTo(A other) {
      return this.num.compareTo(other.num); 
       }
@Override
public String toString() {
    return "Number: " + num + ", String: " + str;
}


}