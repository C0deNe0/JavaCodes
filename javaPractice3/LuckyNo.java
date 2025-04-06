import java.util.Scanner;

public class LuckyNo {

    public static int sumOfDigit(int x){
        int rem=0,sum=0;
        while(x!=0){
            rem = x%10;
            x=x/10;
            sum= sum +rem;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num =scanner.nextInt();
        int sum =0;
        while (sumOfDigit(num)>=9) {
            sum = sumOfDigit(num);
        }
        

        System.out.println("The Result is " + sum);
    }

}
