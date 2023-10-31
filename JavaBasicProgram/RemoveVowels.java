public class RemoveVowels {

    public static void main(String[] args) {
        String s = "hello i am java developer sachin";
        String s1 = "";
        s1 = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String after removing vowel : " + s1);
    }

}
/* WAP to remove all vowels from string */
/*
 * input :- i am java developer
 * output :- String after removing vowel : m jv dclpr
 */