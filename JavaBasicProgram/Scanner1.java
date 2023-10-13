//How to take input from user using Scanner Class

import java.util.Scanner;

class Scanner1
{
 	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter value: ");
		int a=sc.nextInt();
		System.out.print("Enter value: ");
		double b=sc.nextDouble();
	
		System.out.println(a+b);
	}
}

/*
Enter value: 2
Enter value: 5
7.0
*/