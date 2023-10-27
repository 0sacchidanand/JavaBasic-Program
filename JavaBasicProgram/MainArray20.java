import java.util.Arrays;

class ArrayMethod15 {
    // Method to find adjacent values from the array
    int[] adjacentFromArray(int a[]) {
        int b[] = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            b[i] = Math.abs(a[i] - a[i + 1]);
        }
        return b;
    }

    int minAdjacentFromArray(int a[]) {
        int min = a[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    void nearestElementFromArray(int a[]) {
        int[] b = Arrays.copyOf(a, a.length);
        Arrays.sort(b);
        int min = minAdjacentFromArray(adjacentFromArray(b));

        for (int i = 0; i < b.length - 1; i++) {
            if (min == Math.abs(b[i] - b[i + 1])) {
                System.out.println("Nearest elements: " + b[i] + " and " + b[i + 1]);
            }
        }
    }

    void displayArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

public class MainArray20 {
    public static void main(String[] args) {
        ArrayMethod15 am = new ArrayMethod15();
        int[] a = {1, 20, 3, 5, 7,  8, 4, 6};

        am.nearestElementFromArray(a);
    }
}
