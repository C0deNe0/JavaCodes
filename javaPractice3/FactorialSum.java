import java.util.Scanner;

public class FactorialSum {

    public static int factorial(int n){
        if(n<1){
            return 1;
        }
        
        return n*factorial(n-1);
        }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int sum=0,rem=0;
       while(num>0){
        rem=num%10;
        num=num/10; 
        sum = sum + factorial(rem);
        }
        System.out.println("Result "+sum);

        scanner.close();
    }

}
