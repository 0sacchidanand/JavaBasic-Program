public class CountP37 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print("\t");
            }
            int c = count;
            for (int j = n; j >= i; j--) {
                System.out.print(c + "\t");
                c += j;
            }
            System.out.println();
            count++;
        }
    }

}
