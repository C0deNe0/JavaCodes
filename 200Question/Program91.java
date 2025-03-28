
//

import java.util.Scanner;

public class Program91 {
    public static int countAllTheDigits(int a){
        int count =0;
        while (a!=0) {
            a/=10;
            count++;
        }
        // System.out.println(count);
        return count;
    }

    public static int pow(int a,int b){
        int p=1;
        while(b!=0){
            p*=a;
            b--;
        }
        // System.out.println(p);
        return p;
    }

    public static int firstno(int num){
     
        while(num>9){
            num = num/10;
         }
        return num;
    }

    
    public static int primeNo(int n){
        int i;
        for(i=2;i*i<=n;i++){
            if(n%i==0) return 1;
        }
        return 0;
    }

    public static int circularPrime(int num){
        int count = countAllTheDigits(num);
        while(primeNo(num)==0){
        while (count!=0) {
               int firstNo= firstno(num);
               int remainingNo = num -firstNo*pow(10, countAllTheDigits(num)-1);
               num = remainingNo*10 + firstNo;
               System.out.println(num);
               count--; 
            } 
            return 1;

        }
        return 0;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        if(circularPrime(num)==1) System.out.println("this is a circular prime");
        else System.out.println("Not a circluar prime");
         // System.out.println("these are Cyclic prime");
        scanner.close();
    }   
}
