//find max element from array

class MaxEle
{
	public static void main(String args[])
	{
		int a[] = {5,8,56,88,94,1,3,4};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		System.out.print("max="+max);
	}
}
//max=94

