class CountP11
{
	public  static void main(String args[])
	{
		int n=5;
		int count=n;
		for(int i=n;i>=1;i--)
		{	
			int c=count;
			for(int j=i;j>=1;j--)
			{
				System.out.print(c+"\t");
				c--;
			}
		System.out.println();
		count+=i-1;
		}
	}	
}01:28 PM 11-09-202301:28 PM 11-09-2023
/*
5	4	3	2	1	
9	8	7	6
12	11	10
14	13
15
*/