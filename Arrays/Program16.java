import java.util.HashSet;

//Intersection of two arrays

public class Program16 {

    
    public static void intersectionArray(int[] a,int[] b){

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < b.length; j++) {
            
               if(a[i] ==b[j]) set.add(a[i]);
           }
            
        }
        System.out.println(set);


    }
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the length of the array: ");
        // int n = scanner.nextInt();

        int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[]{ 3,6,91};
        
        intersectionArray(arr,arr2 );

        System.out.println();

        // scanner.close()
    }
}
