
//mod the length to the elemts and store them in the same index

public class pro4 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,6,2,9,7,4};
   
            int n= arr.length;
            for (int i = 0; i<arr.length;i++ ) {
                   arr[i] %=n;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }    
}
