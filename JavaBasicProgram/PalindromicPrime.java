class PalindromicPrime
{
	public static void main(String [] args)
	{
		int a=0;
		int last=82;
		int count=0;
		while(true)
		{
		int n=a,sum=0;
		while(n!=0)
		{
			sum*=10;
			sum+=n%10;
			n/=10;
		}
		if(sum==a)
		{
			boolean b= false;
			if(sum==0 || sum==1){
				b=true;
			}
			else{
				for(int i=2;i<=sum/2;i++)
				if(sum%i==0)
				{
					b=true;
					break;
				}
			}
			if(!b)
				count++;
			if(count==last)
			{
				System.out.print(last+" th palindromic prime number is "+a);
				break;
			}
		}
		a++;
	}
	}
}
/* 82 th palindromic prime number is 74747 */
