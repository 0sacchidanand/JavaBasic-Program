//WAP to  revers array without using any variable.

class ReversArray
{
	public static void main(String [] args)
	{
		int a[]={10,20,30,40,50};
		for(int i=0;i<a.length/2;i++)
		{
			a[i]+=a[a.length-i-1];
			a[a.length-i-1]=a[i]-a[a.length-i-1];
			a[i]-=a[a.length-i-1];
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
/*
50 40 30 20 10
*/