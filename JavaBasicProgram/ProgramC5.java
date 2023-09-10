class ProgramC5
{
	public static void main(String [] args)
	{
		int n=5;
		int count=1;
		for (int i=1;i<=n;i++)
		{	
			int c=count;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+"\t");
				c++;
			}
		System.out.println();
		count+=i+1;
		}
	}
}
/*
1
3       4
6       7       8
10      11      12      13
15      16      17      18      19
*/