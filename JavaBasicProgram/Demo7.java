class Demo7
{
	int a,b;
	Demo7()
	{
		a=10;b=20;
		System.out.println("Default const");
	}
	void display()
	{
		System.out.println("a=" +a+ "b="+b);
	}
	{
		System.out.println("Instance block");
	}
	static {
			System.out.println("Static block");
		}
}