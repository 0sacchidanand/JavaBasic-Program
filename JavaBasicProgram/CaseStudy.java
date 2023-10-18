//case Study

class CaseStudy
{
	public static void main(String [] args)
	{
		int a[] = {15,16,21,28,14,24,28,18,9,42,35,41,35};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%4==0)
				if(a[i]%7==0)
					a[i]=-3;
				else

					a[i]=-1;
			else
				if(a[i]%7==0)
					a[i]=-2;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

/*15 -1 -2 -3 -2 -1 -3 18 9 -2 -2 41 -2*/ 