//WAP to find sum of Array

import java.util.Scanner;
class ArraySum
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		int a[]={2,3,4,5,6,7,7};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			//sum+=a[i]; 
		}
			System.out.println("Sum of Array: "+sum);

	}
}

/*
Sum of Array: 34
*/