public class Program10 {
    //Merge array
    public static void mergeArrays(int[] a,int[] b){
            
        int[] mergeArrays = new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            mergeArrays[i] =a[i];
        }
        for (int i = 0; i < b.length; i++) {
            mergeArrays[a.length+i] = b[i];
        }

        System.out.println();
        System.out.println("The merged array is : ");
        for (int i : mergeArrays) {
            System.out.print(i+" ");
        }
    }
    
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the length of the array: ");
        // int n = scanner.nextInt();

        int[] arr = new int[]{ 3,6,2,9,7,4};
        int[] arr2 = new int[]{1,1,1,1,1,1};
        System.out.println("First array: ");
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }

        System.out.println("Second array : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        
        mergeArrays(arr, arr2);

        // scanner.close()
    }
}
