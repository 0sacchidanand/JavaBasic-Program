//Type of constructor

class ConsType
{
	int a,b;
	
	ConsType()
	{	
		 a=10;
		 b=30;	
		System.out.println("default Constructor");
	}//default constructor	

	ConsType(int a,int b)
	{
		this.a=10;
		this.b=30;
		System.out.println("User-defined COnstructor");
	}//parameterized constructor

	void display()
	{
		System.out.println("a="+a+"b="+b);
	}
	
}