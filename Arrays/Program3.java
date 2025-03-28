public class Program3 {
    

    public static void sumOfElem(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("THe sum of ELements is : "+ sum);
    }
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the length of the array: ");
        // int n = scanner.nextInt();

        int[] arr = new int[]{ 3,6,2,9,7,4};

        sumOfElem(arr);
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }
        System.out.println();

        // scanner.close()
    }
}
