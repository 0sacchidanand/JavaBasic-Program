public class ReverseEachWord {
    public static void main(String[] args) {
        String s1 = "hello i am java developer";
        String s2[] = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s2.length; i++) {
            String s3 = s2[i];
            for (int j = s3.length() - 1; j >= 0; j--)
                sb.append(s3.charAt(j));
            if (i < s2.length - 1)
                sb.append(" ");
        }
        System.out.println(sb);
    }
}
/* WAP to reverse each word from string */