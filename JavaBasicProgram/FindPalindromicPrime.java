public class FindPalindromicPrime {
    public static void main(String[] args) {
        int a = 0, count = 0, last = 82;
        while (true) {
            int n = a, sum = 0;
            while (n != 0) {
                sum *= 10;
                sum += n % 10;
                n /= 10;
            }
            if (sum == a) {
                boolean b = false;
                if (sum == 0 || sum == 1)
                    b = true;
                else {
                    for (int i = 2; i <= sum / 2; i++)
                        if (sum % i == 0) {
                            b = true;
                            break;
                        }

                }
                if (!b)
                    count++;
                if (count == last) {
                    System.out.println(last + " th is palaindromic prime " + a);
                    break;
                }
            }
            a++;
        }
    }
}
// 82 th is palaindromic prime 74747