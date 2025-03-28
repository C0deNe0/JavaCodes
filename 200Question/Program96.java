import java.util.Scanner;
/*

96 Write a program to check if a number is Mersenne number or not.
In mathematics, a Mersenne number is a number that can be written in the form M(n) =
2
n − 1 for some integer n.
The first four Mersenne primes are 3, 7, 31, and 127
Expected Output
Input a number: 127
127 is a Mersenne number.

97
 */


public class Program96 {
    public static int power(int a ,int b){
        int p=1;
        while(b!=0){
            p=p*a;
            b--;
        }   
        // System.out.println("the power"+p);
        return p;
    }

    public static int primeNo(int n){
        int i;
        
        for(i=2;i*i<=n;i++){
            if(n%i==0) {
                return 1;

            }
        }
        return 0;
    }


    public static int MersenneNo(int p){
        return power(2, p)-1; 
    }

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
           if(primeNo(MersenneNo(i))==0) System.out.print(MersenneNo(i)+" ");
           else System.out.print("");       
        }

        scanner.close();
    } 
}
