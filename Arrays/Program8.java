public class Program8 {
    
    //Find second largest Number
    public static void secondMaxElement(int[] arr){
        
        int max =0;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) max =arr[i];
        }
       
        for (int i = 0; i < arr.length; i++) {
            if(max == arr[i]) arr[i] =0;
        }
        int Secondmax =0;
        for (int j : arr) {
            if(Secondmax < j) Secondmax =j;
        }

        System.out.println("\nThe second largest is : " + Secondmax );
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
