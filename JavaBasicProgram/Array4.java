class Array4
{
	public static void main(String [] args)
	{
		int a[] = {10,20,30,40,50};
		int b[]=new int[a.length];
	for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		b[i]=a[i];
	
	for(int i=0;i<a.length;i++)
		System.out.println(a[i]+"\t"+b[i]);
	System.out.println(a==b);
	}
}
//find array size and Create object using copy
/*
10
20
30
40
50
true
*/