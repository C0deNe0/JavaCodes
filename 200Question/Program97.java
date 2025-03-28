import java.util.Scanner;

public class Program97 {
       public static int power(int a ,int b){
        int p=1;
        while(b!=0){
            p=p*a;
            b--;
        }   
        // System.out.println("the power"+p);
        return p;
    }

    public static int countTheDigits(int x){
        int count=0;
        while (x!=0) {
            x/=10;
            count++;            
        }
        // System.out.println("The count is :"+count);
        return count;
    }

    public static int checkArmstrong(int n){
        int count = countTheDigits(n);
        int temp =n;
        int rem=0,sum=0;
        while (n!=0) {
            rem = n%10;
            n/=10;
            sum = sum +power(rem, count);
        }
        // System.out.println("the sum "+sum);
        // return sum;
        if(sum == temp ) return 1;
        else return 0;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        int i=0;
        while (num>0) {
            int res = checkArmstrong(i);
            if(res ==1) num--;
            i++;
            
        }
            System.out.println(i-1);
        scanner.close();
    } 
}
