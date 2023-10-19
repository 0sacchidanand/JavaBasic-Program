class PalindromN
{
	public static void main(String [] args)
	{
		int n=122,sum=0,n1=n;
		while(n1!=0)
		{
			sum*=10;
			sum+=n1%10;
			n1/=10;
		}
		if(sum==n)
		
		
			System.out.print(n+ " is Palindrom number ");
		
		else
		
			System.out.print(n+" is not palindrom number ");
		
	}
}
/*122 is not palindrom number*/