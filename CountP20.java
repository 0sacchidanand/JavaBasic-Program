public class CountP20 {
    public static void main(String[] args) {
        int n = 5;
        int count = (n * (n + 1)) / 2;
        for (int i = 1; i <= n; i++) {
            int c = count;
            for (int j = i; j <= n; j++) {
                System.out.print(c + "\t");
                c = c - j;
            }
            System.out.println();
            count = count - i - 1;
        }
    }
}
/*
 * 15 14 12 9 5
 * 13 11 8 4
 * 10 7 3
 * 6 2
 * 1
 */