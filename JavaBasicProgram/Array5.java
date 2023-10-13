import java.util.Arrays;

class Array5
{
	public static void main(String [] args)
	{
		int a[] = {10,20,30,40,50};
		int b[]=Arrays.copyOf(a,a.length);
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+"\t"+b[i]);
	
	}
}
//find array size and Create object using copy

/*
10      10
20      20
30      30
40      40
50      50
*/