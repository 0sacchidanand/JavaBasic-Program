public class CountP42 {
    public static void main(String[] args) {
        int n = 5;
        int count = (n * (n + 1)) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print("\t");
            }
            int c = count;
            for (int j = i; j <= n; j++) {
                System.out.print(c + "\t");
                c -= j;
            }
            System.out.println();
            count -= i + 1;
        }
    }

}
