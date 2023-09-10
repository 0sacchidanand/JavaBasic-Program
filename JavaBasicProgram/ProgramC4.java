class ProgramC4
{
	public static void main(String []args)
	{
		int n=5; 
		
		int count=(n*(n+1))/2)+1;  //formula for reverse
		for(int i=1;i<=n;i++)
		{	count -=i;
			int temp = count;
			for(int j=0;j<i;j++)
			{
				System.out.print(temp+j+"\t");
				
			}
		System.out.println();
		}
	}
}