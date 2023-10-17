class FirstDiToLast
{
	public static void main(String [] args)
	{
		int a[]={312,421,235,236,3432};
		int last=0;
		
		for(int i=0;i<a.length;i++)
		{
			
		last = a[i]%10;
		int first =0;
			while(a[i]!=0)
			{
				first=a[i]%10;
				a[i]/=10;		
			
			}
			a[i]=first*10+last;
		}
		
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
	}
		
}