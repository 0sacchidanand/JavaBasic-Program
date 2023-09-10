class CountP3
{
	public static void main(String [] args)
	{
		int n=5;
		int count=1;
		for(int i=n;i>=1;i--)	//5  4
		{	
			int c=count;
			for(int j=i;j<=n;j++)
			{
				System.out.print(c+"\t");
				c-=j-1;
			}
		System.out.println();
		count+=i;
		
		}
	}
}
/*
1
6       3
10      8       5
13      12      10      7
15      15      14      12      9
*/