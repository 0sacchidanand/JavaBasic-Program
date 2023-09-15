 class CountP45
 {
    public static void main(String[] args) 
	{
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) 
	{
		for(int j=i;j<n;j++)
		{
			System.out.print(" ");
		}
                 int c=count;
                for (int j = i; j >= 1; j--)
        	{
                System.out.print((char)(c+96));
                c--;
       	    }
            System.out.println();
            count +=i+1;
        }
    }
}
/*
    a
   cb
  fed
 jihg
onmlk
*/