public class ArrayMethod2 {
    int sumOfArray(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }
}
