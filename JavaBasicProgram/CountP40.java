public class CountP40 {
    public static void main(String[] args) {
        int n = 5;
        int count = ((n * (n - 1)) / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print("\t");
            }
            int c = count;
            for (int j = n; j >= i; j--) {
                System.out.print(c + "\t");
                c -= j - 1;
            }
            System.out.println();
            count++;
        }
    }
}
