
//all the spy number up to range

import java.util.Scanner;

public class Program41 {


    public static int sumOfallDigits(int n){
        int sum =0,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            sum +=rem;
        }
        System.out.println("sum :"+sum);
        return sum;
    }
    
    
    public static int productOfAllDigits(int n){
        int mul =1,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            mul*=rem;
        }
        System.out.println("mul :"+mul);
        return mul;
    }

    public static int spyNo(int x){
        if(sumOfallDigits(x)==productOfAllDigits(x)){
            return 1;
        }else{
            return 0;
        }
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            if(spyNo(i)==1) System.out.print(i + " ");
            else System.out.print("");
        }

        scanner.close();
    } //   PRIME No check kar    
}
