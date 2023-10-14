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
		int evenCount = 0;
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
				evenCount++;
			}
			
		}
		
		
	System.out.println("Avg of odd numbers :"+oddSum/oddCount);
	System.out.println("Avg of even Numbers:"+evenSum/evenCount);
	}
}

/*
Avg of odd numbers :4.5
Avg of even Numbers:5.666666666666667
*/