public class SwappingWithoutThird {
    public static void main(String[] args) {
        int n1=10;
        int n2=20;
        
        System.out.println("before swap " +n1 +","+n2);
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("after swap " +n1 +","+n2);
    }
    
}
