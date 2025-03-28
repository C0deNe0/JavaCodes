import java.util.Scanner;

public class Program7 {
    

    public static void reverseArray(int[] arr,int n){
        int l=0,j=n-1;
           while (l<j) {
            int temp = arr[l];
             arr[l] =arr[j];
             arr[j]=temp;
             l++;j--;
           
        }
        System.out.println("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = scanner.nextInt();


        int[] arr = new int[]{ 3,6,2,9,7,4};

        reverseArray(arr,n);
        
        System.out.println();

        scanner.close();
    }
}
