 class ReplaceElement2
{
	public static void main(String [] args)
	{
		int a[]={123,1289,784,535,9283,35248,217321,5165,6418,3155,8685,4958};
		int count = a.length;
		for(int i=0;i<a.length;i++)
		{
			int n= count;
			int base=1;
			while(n!=0)
			{
				base*=10;
				n/=10;
			}
			a[i]*=base;
			a[i]+=count--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

/*12312 128911 78410 5359 92838 352487 2173216 51655 64184 31553 86852 49581*/