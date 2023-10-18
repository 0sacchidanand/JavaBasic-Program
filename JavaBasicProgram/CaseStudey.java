class CaseStudey
{
	public static void main (String [] args)
	{
		int a[]={15,16,21,28,14,24,28,18,9,42,35,41,35};
		int white=0;
		int black=0;
		int grey=0;
		
		for(int i=0;i<a.lemgth;i++)
		{
			if(a[i]%4==0 && a[i]%7==0)
			{
				a[i]= -3;
			}	
			else if(a[i]%4==0)
			{
				a[i]=-1;
			}
			else if(a[i]%7==0)
			{
				a[i]=-2;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}