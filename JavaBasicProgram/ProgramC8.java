class ProgramC8
{
	public static void main(String args[])
	{
		int n=5;
		int count=(n*(n+1))/2;
		for(int i=n;i>=1;i--)
		{
			int c=count;
			for(int j=n;j>=i;j--)
			{
				System.out.print(c+"\t");
				c+=j+1;
				
			}
		System.out.println();
		count--;
		}

	}
}
/*
5 
4	9	
3	8	12
2	7	11	14
1	6	10	13	15
*/