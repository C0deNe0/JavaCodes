
/*Write a Java program to classify Abundant, deficient and perfect number (integers)
between 1 to 10,000.
In number theory, an abundant number is a number for which the sum of its proper
divisors is greater than the number itself. */



/*Deficient number: In number theory, a deficient number is a number n for which the
sum of divisors σ(n)<2n, or, equivalently, the sum of proper divisors (or aliquot sum)
s(n)<n. The value 2n − σ(n) (or n − s(n)) is called the number's deficiency.
As an example, divisors of 21 are 1, 3 and 7, and their sum is 11. Because 11 is less
than 21, the number 21 is deficient. Its deficiency is 2 × 21 − 32 = 10.
The first few deficient numbers are:
1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 19, 21, 22, 23, 25, 26, 27, 29, 31, 32, 33, */

import java.util.Scanner;

public class Program77 {

    public static int deficientNo(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum<n){
            return 1;
        }
        else return 0;
    }





    public static int checkAbundantNo(int n){
        int sum= 0,temp=n;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }

        }
        if(sum>temp) return 1;
        else return 0;
}

public static int checkPerfectNo(int n){
    int sum =0;
    int temp = n;

    for(int i=1;i<=n/2;i++){
        if(n%i==0){
            sum += i;
        }
    }
    if(sum == temp) return 1;
    else return 0;
}

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        int c1=0;
        for(int i=1;i<num;i++){
            if(checkPerfectNo(i)==1) {
                // System.out.print(i + " ");
            c1++;}
            else System.out.print("");
        }

        int c2=0;
        for (int i = 1; i <= num; i++) {
            if (checkAbundantNo(i)==1) {
                // System.out.print(i+" ");
                c2++;
            }
            else{
                System.out.print("");
            }
        }

        int c3=0;
        for(int i=1;i<=num;i++){
            if(deficientNo(i)==1){
                c3++;
            }
            else{
                System.out.print("");
            }
        }


        System.out.println("Abudant Number: "+c1);
        System.out.println("Perfect Number: "+c2);
        System.out.println("Deficient Number: "+c3);


        scanner.close();
    } 
}
