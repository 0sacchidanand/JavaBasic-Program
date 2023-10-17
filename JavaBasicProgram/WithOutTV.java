//WAP to swap 1st and last element without creating any array.

class WithOutTV
{
	public static void main(String [] args)
	{
		int a[] = {10,20,30,40,50};
		a[0]+=a[a.length-1];
		a[a.length-1]=a[0]-a[a.length-1];
		a[0]-=a[a.length-1];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
}
/*
50 20 30 40 10
*/