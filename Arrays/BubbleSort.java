public class BubbleSort {


    public static void bubble(int[] arr){

        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j <  arr.length -1-i; j++) {
                if(arr[j]>arr[j+1]){
                    //swap them 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,0};
        System.out.println("Before Sorting : ");
        for(int i: arr){
            System.err.print(i+ "  ");
        }

        bubble(arr);
        System.out.println("\nAfter Sorting : ");
        for (int i : arr) {
            System.out.print(i+"  ");
        }
    }
}
