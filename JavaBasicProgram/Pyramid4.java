class Pyramid4
{
	public static void main(String [] args)
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(i);
			}
			for(int j=i+1;j<=n;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
	
	}
}
/*
    5
   444
  33333
 2222222
111111111
*/