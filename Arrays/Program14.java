
public class Program14 {
    //move zeroes to end
    public static void main(String[] args) {
        int[] arr=new int[]{0,0,3,0,0,7};
        int end=arr.length-1;
        
        for (int i = 0; i < arr.length; i++) {

                if(arr[i] !=0) {
                    int temp =arr[i];
                    arr[i] = arr[end];
                    arr[end] =temp;                
            }
            end--;
    }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
