public class CountP29 {
    public static void main(String[] args) {
        int n = 5;
        int count = ((n * (n + 1)) / 2) - n + 1;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print("\t");
            }
            int c = count;
            for (int j = n; j >= i; j--) {
                System.out.print(c + "\t");
                c -= j;
            }
            System.out.println();
            count++;
        }
    }

}
