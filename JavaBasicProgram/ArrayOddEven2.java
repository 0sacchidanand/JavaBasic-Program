//WAP to find averge of array

class ArrayOddEven1
{
	public static void main(String [] args)
	{
		//Scanner sc = new Scanner (System.in);
		
		int  a[]={4,2,6,6,8,8,9,1,3,5};
		double oddSum = 0;
		double evenSum = 0;
		int oddCount = 0;
		for(int i=0;i<a.length;i++)
		{	
			if(a[i]%2!=0)
			{
				oddSum+=a[i];
				oddCount++;
			}
			else
			{
				evenSum+=a[i];
				
			}
			
		}
		
		
	System.out.println("Avg of odd numbers :"+oddSum/oddCount);
	System.out.println("Avg of even Numbers:"evenSum/(a.lenght-oddCount));
	}
}

/*
1
3
Avg :5.0
*/