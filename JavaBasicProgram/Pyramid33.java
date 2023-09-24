class Pyramid33
{
	public static void main(String args[])
	{
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
			
				System.out.print(" ");
		
			for(int j=i;j<=n;j++)
				
				if(i%2!=0)

					System.out.print((char)(i+64));
				else
															System.out.print((char)(i+96));

			for(int j=n-1;j>=i;j--)
		
				if(i%2!=0)

					System.out.print((char)(i+64));
				else
															System.out.print((char)(i+96));
			
			
			
	System.out.println();
		
			
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=i;j>1;j--)
			
				System.out.print(" ");
		
			for(int j=i;j<=n;j++)
		
				if(i%2!=0)

					System.out.print((char)(i+64));
				else
															System.out.print((char)(i+64));
			for(int j=n-1;j>=i;j--)
		
				if(i%2!=0)

					System.out.print((char)(i+64));
				else
															System.out.print((char)(i+64));
			
			
			
	System.out.println();
		
			
		}
		
	}
}

/*
AAAAAAAAA
 bbbbbbb
  CCCCC
   ddd
    E
   DDD
  CCCCC
 BBBBBBB
AAAAAAAAA
*/