public class FingLongestWord {
    public static void main(String[] args) {

        String s = "Welcome to international airprot ";
        String[] s1 = s.split(" ");
        String maxlethWord = "";
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].length() >= maxlethWord.length()) {
                maxlethWord = s1[i];
            }
        }
        System.out.println(maxlethWord + " is longWord");
    }

}
/* WAP to fing a longest worg in string */