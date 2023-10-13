//How to take input from user using BufferedReader

import java.io.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Buffer
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter a Value : ");
		int a= Integer.parseInt(br.readLine());
		System.out.print("Enter a value: ");
		int b= Integer.parseInt(br.readLine());

		System.out.println(a+b);
	}
}

/*
Enter a Value : 5
Enter a value: 6
11
*/