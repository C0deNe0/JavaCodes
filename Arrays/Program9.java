public class Program9 {

    public static void secondMaxElement(int[] arr){
        
        int min =arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) min =arr[i];
        }
       
        for (int i = 0; i < arr.length; i++) {
            if(min == arr[i]) arr[i] =arr.length;
        }

        int Secondmin =arr.length;
        for (int j : arr) {
            if(Secondmin > j) Secondmin =j;
        }

        System.out.println("\nThe second smallest is : " + Secondmin );
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the length of the array: ");
        // int n = scanner.nextInt();

        int[] arr = new int[]{ 3,6,2,9,7,4};

        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }

        secondMaxElement(arr);
        System.out.println();

        // scanner.close()
    }
}
