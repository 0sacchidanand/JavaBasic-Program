//Wap To find a nearest element  from array
import java.util.Arrays;
class ArrayMathood14
{
	//method to find adecent values from array 

	int [] adjecentfromArray(int a[])
	{	
		 int b[]=new int [a.length-1];
       		 for (int i = 0; i < a.length - 1; i++) 
		{
            		b[i]=Math.abs(a[i]-a[i+1]);
		}
		return b;
	}

	int minAdjecentfromArray(int a[])
	{
		int min=a[a.length-1];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i]&&a[i]!=0)
			{
				min = a[i];
			}
		}
		return min;
	}
	
	void nearestElementFromArray(int a[])
	{
		int b[]= Arrays.copyOf(a,a.length);
		Arrays.sort(b);
		int min = minAdjecentfromArray(adjecentfromArray(b));
		for(int i=0;i<a.length;i++)
		if(min==Math.abs(b[i]-b[i+1]))
		System.out.print(b[i]+"\t"+b[i+1]);
	}
	
	void displayArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+ " ");
	}
	
}