
//Write a Program to Find nth Disarium Number.

import java.util.Scanner;

public class Program62 {

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

public static int disariumNo(int n){
    int count = countAllTheDigits(n);
    int temp =n;
    int rem=0,sum=0;
    while (n!=0) {
        rem =n%10;
        n/=10;
        sum+=pow(rem,count);
        count--;
    }
   if(sum ==temp ) return 1;
   else return 0;
}

  
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        int i=0;
        while (num>0) {
            if(disariumNo(i)==1) num--;
            i++;
        }
        System.out.println(i-1);
        scanner.close();
    } 
    
}
