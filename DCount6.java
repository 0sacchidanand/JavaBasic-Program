class DCount6
{
	public static void main(String args[])
	{
		int n=5;
		int count1=n;
		int count2=n;
		for(int i1=n;i1>=1;i1--)
		{
			int c1=count1;
			int c2=count2;
			for(int j1=i1,j2=n;j1<=n||j2>=n;j1++,j2--)
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96));
				System.out.print("\t");
				c1-=j1+1;
				c2+=j2;
			}
		System.out.println();
		count1+=i1-1;
		count2--;
		
		}
	}
}
/*

*/