class ProgramC3
{
	public static void main(String []args)
	{
		int n=5; 
		
		int count=0;        //(n*(n+1))/2  formula for reverse
		for(int i=1;i<=n;i++)
		{	count +=i;
			int temp = count;
			for(int j=0;j<i;j++)
			{
				System.out.print(temp-j+"\t");
				
			}
		System.out.println();
		}
	}
}
/*
1

3	2

6	5	4

10	9	8	7

15	14	13	11
*/