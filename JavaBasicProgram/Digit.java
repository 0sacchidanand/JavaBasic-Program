// Write a method first and last digit from given number
//input=213719  output=29

class Digit
{
	int FindFirstAndLastDigit(int n)
	{
		int last=n%10;
		int first=0;
		while(n!=0)
		{
			first=n%10;
			n/=10;
		}
			first*=10;
			first+=last;
		return first;
	}
}
