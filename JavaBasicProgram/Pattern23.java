public class Pattern23 {
    public static void main(String[] args) {
        int s = 5;
        for (int i = 1; i <= s; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2; k++) {
                System.out.println();
            }

        }
    }

}
/*
 *
 
 **
 ***
 ****
 ****
 */
