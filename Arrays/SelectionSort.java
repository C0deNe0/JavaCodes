public class SelectionSort {
    
    public static void selection(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minindex =i;
            for (int j = i+1; j < n; j++) {
                  if(arr[minindex] < arr[j]) minindex =j;
                  //swap
                  int temp = arr[j];
                  arr[j] =arr[minindex];
                  arr[minindex] = temp;

            }
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,6,7,3,5};
        selection(arr);
    }
}
