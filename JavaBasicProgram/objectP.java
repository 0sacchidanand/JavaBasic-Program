class ObjectP1
{	
	int a;
	int b;
	void display()
	{
		System.out.println("a=" +a+ "b="+b);
	}
	public boolean equals(demo d1)
	{
		if(b==d1.a)
			return true;
		return false;
	}
}