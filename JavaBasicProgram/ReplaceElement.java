class ReplaceElement
{
	public static void main(String args[])
	{	
		
		int a[]={154,263,385,4985,5166,1234,2165,5645,8466,5491,6455,6466};
		int count=1;
		for(int i=a.length-1;i>=0;i--)
		{
			int n=a[i];
			
			
			
			if(count>=10)
			{
				n=n*100+count;
			}
			else
			{
				n=n*10+count;
			}
			a[i]=n;
			count++;
		}
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}