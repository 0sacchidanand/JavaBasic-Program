class Traingle9
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				for(int j=i;j<n;j++)
				{
					System.out.print(" ");
				}
				for(int j=n-i+1;j<=n;j++)
				{
					if(j%2!=0)
						System.out.print((char)(n-i+1+64));
					else
						System.out.print((char)(n-i+1+96));
				}
			}
			else
			{
				for(int j=i;j>n;j--)
				{
					System.out.print(" ");
				}
				for(int j=i-n+1;j<=n;j++)
				{
					if(j%2!=0)
						System.out.print((char)(i-n+1+64));
					else
						System.out.print((char)(i-n+1+96));	
				}
			}

			System.out.println();
			
		}

	}
}

/*
    E
   dD
  CcC
 bBbB
AaAaA
 bBbB
  CcC
   dD
    E
*/