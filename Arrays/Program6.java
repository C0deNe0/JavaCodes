
import java.util.Scanner;

public class Program6 {
 
    public static boolean checkExistence(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the length of the array: ");
        // int n = scanner.nextInt();

        int[] arr = new int[]{ 3,6,2,9,7,5};
        System.out.println("Give a element: ");
        int x = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("the Existence Of the Element is "+checkExistence(arr, x));
        scanner.close();
    }
}
