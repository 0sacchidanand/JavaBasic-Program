public class CopyArray {
    public static void main(String[] args) {
        //initializing 1st array
        int arr1[] = new  int[]{1,3,5};

        //creating a 2nd array arr2 with same size as arr1

        int arr2[] = new int [arr1.length];

        //copying all element of arr1 to arr2
        for(int i=0;i<arr1.length;i++){
            arr2[i]= arr1[i];

        }
        System.out.println("Display the of 2nd array");

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
    
}
