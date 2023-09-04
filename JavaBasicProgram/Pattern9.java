public class Pattern9 {
    public static void main(String[] args) {

        for (int i = 5; i >= 0; i--) {
            int a = 65;
            for (int j = 5; j >= i; j--) {
                System.out.print((char) (a + j) + " ");
            }
            System.out.println();
        }
    }

}
