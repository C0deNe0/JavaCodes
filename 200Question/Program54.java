import java.util.Scanner;

//Write a program to find the nth Hashed number.


public class Program54 {
    public static int sumOfallDigits(int n){
        int sum =0,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            sum +=rem;
        }
        return sum;
    }

    public static int checkHarshadNo(int n){
        int sum = sumOfallDigits(n);
        if(n%sum==0){
            return 1;
        }else{
            return 0;
        }
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        int i=1;
        while (num>0) {
            int res = checkHarshadNo(i);
            if(res ==1 ) num--;
            i++;            
        }
        System.out.println(i-1);

        scanner.close();
    } 
}
