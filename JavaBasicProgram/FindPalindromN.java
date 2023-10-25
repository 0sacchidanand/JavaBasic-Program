public class FindPalindromN {
    public static void main(String[] args) {
        int a = 0, count = 0, last = 53;
        while (true) {
            int n = a, sum = 0;
            while (n != 0) {
                sum *= 10;
                sum += n % 10;
                n /= 10;
            }
            if (sum == a) {
                count++;
            }
            if (count == last) {
                System.out.println(last + " th palindrom number " + a);
                break;
            }
            a++;
        }
    }
}
/* 53 th palindrom number 434 */