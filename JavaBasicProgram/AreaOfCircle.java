import java.util.Scanner; 
class AreaOfCircle 
{
	public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
    	
		System.out.println("Enter the radius of circle"); //using user
		int a = sc.nextInt();
		
		double d = 3.14*a*a;	
		System.out.println(d);
	}
}