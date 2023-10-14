//WAP to find averge of array

class ArrayOddEven
{
	public static void main(String [] args)
	{
		//Scanner sc = new Scanner (System.in);
		
		int  a[]={4,2,6,6,8,8,9,1,3,5};
		double sum = 0;
		
		int oddCount = 0;
		for(int i=0;i<a.length;i++)
		{	
			if(a[i]%2!=0)
			{
				sum+=a[i];
				oddCount++;
			}
			
			
		}
		
		
	System.out.println("Avg :"+sum/oddCount);
	}
}

/*
1
3
Avg :5.0
*/