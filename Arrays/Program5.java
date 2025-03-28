import java.util.HashMap;

public class Program5 {
    

    public static void occurrencesCount(int[] arr){
        
        HashMap<Integer,Integer> occurs = new HashMap<>();

        for(int num : arr){
            if(!occurs.containsKey(num)) occurs.put(num,0);
            occurs.put(num, occurs.get(num)+1);
        }
       System.out.println(occurs);
    }

    
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the length of the array: ");
        // int n = scanner.nextInt();

        int[] arr = new int[]{ 3,6,2,9,7,4};
        occurrencesCount(arr);
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }
        System.out.println();

        // scanner.close()
    }
}
