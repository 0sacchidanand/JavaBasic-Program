public class CountChar1 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print("\t");
            }
            int c = count;
            for (int j = i; j <= n; j++) {
                System.out.print((char) (c + 64) + "\t");
                c += j + 1;

            }
            System.out.println();
            count += i;
        }
    }
}
