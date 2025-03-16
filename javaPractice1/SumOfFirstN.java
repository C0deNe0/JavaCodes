import java.util.Scanner;

public class SumOfFirstN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int num = sc.nextInt();
        int sum = 0;
        for( int i=0;i<=num;i++){
            sum = sum+ i;
        }
        System.out.println("The sum of first "+num+" is "+sum);

        sc.close();
  }
    
}


















