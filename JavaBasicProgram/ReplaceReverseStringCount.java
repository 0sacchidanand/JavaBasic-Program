public class ReplaceReverseStringCount {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        String s1 = "hellow i am java developer";

        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        int revCount = count;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb.append(String.valueOf(revCount));
                revCount--;
            } else
                sb.append(s1.charAt(i));
        }
        System.out.print(sb);

    }
}
