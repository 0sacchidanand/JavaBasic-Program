class Pyramid14
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
			
				System.out.print(" ");
		
			for(int j=i;j<=n;j++)
		
				System.out.print(i);

			for(int j=n-1;j>=i;j--)
			
				System.out.print(i);
			
			
	System.out.println();
		}
	}
}

/*
111111111
 2222222
  33333
   444
    5
*/