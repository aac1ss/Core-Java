class stat{
	int Sn;
	String nam;
	static String cmp="Riot";
	
	stat(int sn,String nam)
	{
		this.Sn=sn;
		this.nam=nam;
	}
	
	void met()
	{
		System.out.println(Sn+"."+" Hi "+nam+" from "+cmp);
	}

	public static void main(String[] args)
	{
	stat r=new stat(1,"Ashis");
	r.met();	
	}
}