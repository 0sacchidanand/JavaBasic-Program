//WAP to Repalce  Array Element

class ReplaceArrayEle1
{
	public static void main(String [] args)
	{
		int a[]={123,1289,784,535,9283,35248,21732,9835,2327,5673,2134};
		for(int i=0;i<a.length;i++) 
		{
			int last=a[i]%10;
			int first =0;
			int num=a[i];
			while(num!=0)
			{
				first=num%10;
				num/=10;	
			}
			a[i]=(first*10)+last;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
/*
13 19 74 55 93 38 22 95 27 53 24
*/