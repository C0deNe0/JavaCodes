import java.util.Scanner;

public class SumationOfEachDigit {

    public static int summm(int n){
        int sum=0,rem=0;
        while(n>0){
            rem = n%10;
            n/=10;
            for(int i=1;i<=rem;i++){
                sum =sum+i;
            }
        }
        // System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n =scanner.nextInt();
        
        System.out.println("The required Answer is : "+summm(n));
        scanner.close();
    }
}
