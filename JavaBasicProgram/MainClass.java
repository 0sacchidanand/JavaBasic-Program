class MainClass
{
	public static void main(String []args)
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		d1.a=10;
		d1.b=20;
		d2.a=10;
		d2.b=20;
		System.out.println(d1.a);
		System.out.println(d1.b);

		System.out.println(d2.a);
		System.out.println(d2.b);
	}
}