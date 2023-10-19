class AmstrongNumber
{
	public static void main(String args[])
	{
		int n=153;
		int n1=n;
		int sum=0;
		int base=0;
		while(n1!=0)
		{
			base++;
			n1/=10;
			
		}
		n1=n;
		while(n1!=0)
		{
			sum+=Math.pow(n1%10,base);
			n1/=10;
		}
		if(sum==n)
		    System.out.print(n+ " is strong number ");
	}
}

/*153 is strong number*/