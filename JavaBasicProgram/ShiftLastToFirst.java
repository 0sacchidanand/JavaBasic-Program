class ShiftFirstToLast
{
	public static void main(String [] args)
	{
		int a[]={101,203,305,408,506};
		
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			int first=0;
			int placevalue=10;
			while(num!=0)
			{
				first=num%10;
				num/=10;
				placevalue*10;
			}
			placevalue/=10;
			first=placevalue*first;
			num = num-first;
			num=(num*10)+first;
			a[i]=num;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}