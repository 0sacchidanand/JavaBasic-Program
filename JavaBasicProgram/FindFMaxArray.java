//WAP to find 2nd max element from array
class FindFMaxArray {
    int sMaxArray(int a[]) {
        int max = 0;
	int Smax=0;
        for (int i = 0; i < a.length; i++)
            if (max < a[i]){
		Smax=max;
                max = a[i];
		}
	else
		if (Smax<a[i] && a[i]!=max)
		Smax=a[i];
	System.out.print(max+ "=max ");
        return Smax;
	
    }
}