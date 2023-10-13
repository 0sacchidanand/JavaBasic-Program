//Wap to display lower element then avg of array

class ArrayLower
{
	public static void main(String args[])
	{
		int a[]={17,12,22,19};
		
		double  avg =0;
		for(int i=0;i<a.length;i++)
		
			avg+=a[i];
			avg/=a.length;
		for(int i=0;i<a.length;i++)
		
			if(a[i]<avg)
		
					System.out.println(a[i]);
		

	}
}

/*
17
12
*/