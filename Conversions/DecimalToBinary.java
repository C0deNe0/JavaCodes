
//Decimal to binary

import java.util.Scanner;




public class DecimalToBinary {
    public static int countTheDigits(int x){
        int count=0;
        while (x>1) {
            x/=10;
            count++;            
        }
        // System.out.println("The count is :"+count);
      return count;
    }
    public static int pow(int a ,int b){
        int p=1;
        while(b!=0){
            p=p*a;
            b--;
        }
        return p; 
    }
    public static int reverse(int n){
        int rem=0,rev=0;
        while (n!=0) {
            rem = n%10;
            n/=10;
            rev= rev*10+rem;            
        }
        return rev;
    }

    // public static int inversePower(int n){
    //     int count=0;
    //     while(n!=1){
    //         n=n/2;
    //         count++;
    //     }
    //     return count;
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int rem =0;
        int rev=0;
        int power =1;
        // int temp =num;
        while(num!=0){
            rem = num%2;
            
            rev=rev +(rem*power);
            power = power*10;
            num=num/2;
        }
    //    int count= countTheDigits(temp);
    //     // rev = rev<<inversePower(temp);
    //     rev = reverse(rev);
    //     rev= rev*pow(10,count);
        System.out.println(rev);
        scanner.close();
    }
}
