class stat{
	static int Sn=1;	
	stat()
	{
	System.out.println("Sn is "+Sn+"right now");
	Sn++;
		System.out.println("Sn is "+Sn+"right now");
		System.out.println();
}
	public static void main(String[] args)
	{
	stat r=new stat();
	stat r1=new stat();
	stat r2=new stat();
	}
}