import java.util.Arrays;

public class Program12 {
    
    public static void MissingNumber(int[] arr){
            Arrays.sort(arr);
            int temp=-1;
            for(int i=0;i<arr.length;i++){
                if( i!=arr[i] ) temp=i;  
            }
            System.out.println("The missing element is :" + temp);
        }
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the length of the array: ");
        // int n = scanner.nextInt();

        int[] arr = new int[]{0,1,2,3,5};

        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }
        MissingNumber(arr);
        System.out.println();

        // scanner.close()
    }
}
