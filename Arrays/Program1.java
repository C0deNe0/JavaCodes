// import java.util.Scanner;

public class Program1 {
    
    public static void maxElement(int[] arr){
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) max =arr[i];
        }
        System.out.println("The maximum Element is : "+ max);
    }
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the length of the array: ");
        // int n = scanner.nextInt();

        int[] arr = new int[]{ 3,6,2,9,7,4};

        maxElement(arr);
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }
        System.out.println();

        // scanner.close()
    }
}
