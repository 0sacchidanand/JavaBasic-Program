public class ShiftLtoFChar {
    public static void main(String[] args) {
        String s = "India";
        String shifted = s.substring(s.length() - 1) + s.substring(0, s.length() - 1);
        System.out.println(shifted);

    }
}
/* shift last char to first */