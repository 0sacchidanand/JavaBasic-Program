//WAP to fix Arrray


class FixArray
{
	int sumOfArray(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		sum+=a[i];
		return sum;
	}

	double avgOfArray(int a[])
	{
		return (double)sumOfArray(a)/a.length;
	}

	int fixArray(int a[])
	{
		double avg = avgOfArray(a);
		int shift=0;
		if(avg%1==0)
		{
			for(int i=0;i<a.length;i++)
			while(a[i]!=avg)
			{
				if(a[i]>avg)
					a[i]--;
				else
					a[i]++;
				shift++;
			}
		shift/=2;
		}
	else
		shift=-1;
		return shift;
		
	}
	void displayArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		
			System.out.print(a[i]+ " ");
		
	}	
}

class MainArray6
{
	public static void main(String args[])
	{
		FixArray fa = new FixArray();
		int a[] = {7,3,1};
		int shift =fa.fixArray(a);
		System.out.println(shift);
		fa.displayArray(a);
	}
}