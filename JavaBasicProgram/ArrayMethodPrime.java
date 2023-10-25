//check prime number from array

class ArrayMethodPrime
{	// to chek number
	boolean checkPrimeNumber(int n)
	{
		boolean b=false;
		if(n==0||n==1)
			b=true;
		else
	
			for(int i=2;i<=n/2;i++)
				if(n%i==0)
				{
					b=true;
					break;
				}
		return !b;
		
	}
	//to find prime from array
	int[] findPrimeNumber(int a[])
	{
		int count =0;
		for(int i=0;i<a.length;i++)
			if(checkPrimeNumber(a[i]))
			count++;
		int b[]= new int [count];
		count=0;
		for(int i=0;i<a.length;i++)
			if(checkPrimeNumber(a[i]))		
				b[count++]=a[i];
		return b;
		
	}
	//display an array
	void displayArray(int a[])
	{
		for(int i=0;i<a.length;i++)	

			System.out.print(a[i]+" ");
	}
}
