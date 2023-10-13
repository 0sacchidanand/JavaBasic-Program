class Array2
{
	public static void main(String [] args)
	{
		int a[] = new int[5];
		int b[]=a;
		a[0]=10;
		a[1]=20;	
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
	for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	System.out.println(a==b);


	}
}
//find array size and Create object using reference
/*
10
20
30
40
50
true
*/