public class Program15 {

    public static void UnionArrays(int[] a,int[] b){
            
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

        int[] arr = new int[]{ 3,6,2,9,7,0};

        int[] arr2 = new int[]{1,1,1,1,1,1,1};
        UnionArrays(arr,arr2);
        System.out.println();

        // scanner.close()
    }
}
