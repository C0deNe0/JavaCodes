import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        
        if(num ==0 || num ==1){
            System.out.println("Not a prime number");
        }else if( num ==2 || num ==3){
            System.out.println("Prime Number");
        }
        else if(num%2 ==0 ||num%3 ==0||num%5 == 0){
            System.out.println("not a prime");
        }
        else{
            System.out.println("prime number");
        }

        scanner.close();
    }
}
