import java.util.HashSet;

public class Program11 {
    
    public static void RemoveDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (Integer i : arr) {
            set.add(i);
        }
        System.out.println(set);

    }
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the length of the array: ");
        // int n = scanner.nextInt();

        int[] arr = new int[]{ 3,6,4,9,9,4,1,1,1,1,1,2,2,2,23,3,3,34,4,5,5,5,5,5,5};

        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }


        System.out.println();
        System.out.println("After removing the duplicate Values :");
        RemoveDuplicates(arr);

        // scanner.close()
    }
}
