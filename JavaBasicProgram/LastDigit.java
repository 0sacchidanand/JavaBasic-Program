class LastDigit
{
	public static void main(String args[])
	{
		int a=251362;
		//System.out.println("Last number = " + (a%10)); //lastdigit
	
		//System.out.println("Second last NUmber = " +(a%100)/10);//second last
		System.out.println("Second last NUmber = " +(a%10000)/1000);
	}
}