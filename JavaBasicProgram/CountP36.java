public class CountP36 {
    public static void main(String[] args) {
        int n = 5;
        int count = ((n * (n - 1)) / 2) + 1;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print("\t");
            }
            int c = count;
            for (int j = i; j >= 1; j--) {
                System.out.print(c + "\t");
                c++;
            }
            System.out.println();
            count -= i - 1;
        }
    }
}
