class Pyramid15
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
			
				System.out.print(" ");
		
			for(int j=i;j>=1;j--)
		
				System.out.print(i);

			for(int j=i-1;j>=1;j--)
			
				System.out.print(i);
			
			
	System.out.println();
		}
	}
}

/*
555555555
 4444444
  33333
   222
    1
*/