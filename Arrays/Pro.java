import java.util.Scanner;

public class Pro {




    public static void ReversedArray(int[] arr,int n){
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
        System.out.println("Enter the size of the array: ");
        int n= scanner.nextInt();


        int[] arr = new int[n];

        System.out.println("Enter the variables of The array :");
        for(int i=0;i<n;i++){
            // int var = scanner.nextInt();
            arr[i] =scanner.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }


        int product =1;
        for (int i = 0; i < n; i++) {
            product *=arr[i]; 
        }

        System.out.println("\nEnter the Element you want to search : ");
        int x = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if(arr[i] ==x){
                System.out.print("found "+x +" at index "+i+"\n");
            }
        }

        System.out.println("your array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int max =0;
        for (int i = 0; i < n; i++) {
            if(max<arr[i]) max =arr[i];
        }

        int min=arr[0];
        for (int i = 1; i < n; i++) {
            if (min>arr[i]) min =arr[i] ;
        }

        int evenCount=0,oddCount =0;
        for (int i = 0; i < n; i++) {
            if (i%2==0) evenCount++;
            else oddCount++;
        }

        int evenMem=0,oddMem=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0 ) evenMem++;
            else oddMem++;
        }


         //REVERSE A ARRAY
        ReversedArray(arr, n);

       
        System.out.println();



        int rem=0;
        for (int i = 0; i < n; i++) {
          int  sumOfNo =0;
         
            while(arr[i]!=0){
            rem = arr[i]%10;
            sumOfNo +=rem;
            arr[i]/=10;
        }
        // System.out.println(sumOfNo);
         arr[i] =sumOfNo;
    }

        System.out.println("\nYour summed array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();

       

        System.out.println("There are "+evenCount+" even index and "+oddCount +" odd index");
        System.out.println("There are "+evenMem+" even numbers and "+oddMem +" odd numbers");
        System.out.println("The maximum number is :"+max);
        System.out.println("The minimum number is :"+min);
        System.out.println("The sum of the array element : "+ sum );
        System.out.println("The product of the array element : "+ product );
        scanner.close();
    }

}
