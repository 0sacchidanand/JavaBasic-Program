public class CountP26 {
    public static void main(String[] args) {
        int n = 5;
        int count = (n * (n + 1)) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("\t");
            }
            int c = count;
            for (int j = 1; j <= i; j++) {
                System.out.print(c + "\t");
                c++;

            }
            System.out.println();
            count = count - i - 1;

        }
    }

}
