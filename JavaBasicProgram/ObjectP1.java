class ObjectP1
{	
	int a;
	int b;
	void display()
	{
		System.out.println("a=" +a+ "b="+b);
	}
	public boolean equals(ObjectP1 d1)
	{
		if(a==d1.a)
			if(b==d1.a)
			return true;
		return false;
	}
}