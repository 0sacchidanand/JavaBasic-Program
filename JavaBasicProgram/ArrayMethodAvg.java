public class ArrayMethodAvg {
    int sumOfArray(int a[]) {
        double avg = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) // summation of the elements in array
            sum += a[i];
        return sum;
    }

    double avgOfArray(int a[]) {

        return (double) sumOfArray(a) / a.length;
    }
}
