class Point1{
	private int po1;
	private int po2;
	
	Point1(int x1, int y2){
	this.po1=x1;
	this.po2=y2;
	}

	public void getValue(Point1 p2){
	System.out.println("The point P1(x) is"+this.po1);
	System.out.println("The point P1(y) is"+this.po2);
	System.out.println("The point P2(x) is"+p2.po1);
	System.out.println("The point P2(y) is"+p2.po2);
	}	

	public static void main(String[] args){
	Point1 p1=new Point1(1,2);
	Point1 p2=new Point1(3,4);
	p1.getValue(p2);
	}
}
