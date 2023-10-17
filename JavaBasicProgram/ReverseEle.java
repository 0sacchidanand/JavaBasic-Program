class ReverseEle
{
	public static void main (String [] args)
	{
		int a[]={123,1289,784,535,9283,35248,21732,9835,2327,5673,2134};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int sum=0;
			while(n!=0)
			{
				sum*=10;
				sum+=n%10;
				n/=10;
			}
			a[i]=sum;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

/*321 9821 487 535 3829 84253 23712 5389 7232 3765 4312*/