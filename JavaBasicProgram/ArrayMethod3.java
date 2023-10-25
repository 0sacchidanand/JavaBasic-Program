public class ArrayMethod3 {
    int sumOfArray(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }

    double avgOfArray(int a[]) {
        return (double) sumOfArray(a) / a.length;
    }

    int[] gretherThanAvgOfArray(int a[]) {
        int count = 0;
        double avg = avgOfArray(a);
        for (int i = 0; i < a.length; i++)
            if (a[i] > avg)
                count++;
        int b[] = new int[count];
        count = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] > avg)
                b[count++] = a[i];
        count++;
        return b;
    }

    void displayArray(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
