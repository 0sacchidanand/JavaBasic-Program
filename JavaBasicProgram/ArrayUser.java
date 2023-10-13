//WAP to take input from user , create array and display element

import java.util.Scanner;

class ArrayUser
{
 	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size of array : ");
		
		int a[]= new int [sc.nextInt()];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter a element : ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
} 

/*
Enter Size of array : 5
Enter a element : 6
Enter a element : 2
Enter a element : 3
Enter a element : 6
Enter a element : 4
6
2
3
6
4
*/