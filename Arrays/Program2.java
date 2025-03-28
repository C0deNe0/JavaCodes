public class Program2 {
    
    public static void minElement(int[] arr){
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) min =arr[i];
        }
        System.out.println("The maximum Element is : "+ min);
    }
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the length of the array: ");
        // int n = scanner.nextInt();

        int[] arr = new int[]{ 3,6,2,9,7,4};

        minElement(arr);
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }
        System.out.println();

        // scanner.close()
    }
}
