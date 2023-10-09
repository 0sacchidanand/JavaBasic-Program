class Mainclass6
{
	public static void main(String [] args)
	{
		ObjectP1 d1 = new ObjectP1();
		System.out.println(d1.hashCode());

		ObjectP1 d2 = new ObjectP1();
		System.out.println(d2.hashCode());

		d1.display();
		d2.display();
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
	}
}