//WAP to find averge of array

class ArrayAvg
{
	public static void main(String [] args)
	{
		//Scanner sc = new Scanner (System.in);
		
		int  a[]={4,2,6,6,8,8,9};
		double avg=0;
		for(int i=0;i<a.length;i++)
		{
			avg+=a[i];
			avg/=a.length;
		}

	System.out.println("Avg :"+avg);
	}
}

//Avg :1.4751810166560824