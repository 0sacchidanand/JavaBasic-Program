class AmstrongNumber1
{
	public static void main(String [] args)
	{
		int n=156,sum=0,n1=n,base=0;
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
			System.out.print(n+ " is Amstrong number ");
		
		else
			System.out.print(n+ " is not Amstrong number ");
	}
}

/*156 is not Amstrong number*/