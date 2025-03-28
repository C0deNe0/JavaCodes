
//Write a program to generate and show all Kaprekar numbers less than 1000.

import java.util.Scanner;

public class Program79 {

    public static int countTheDigits(int x){
        int count=0;
        while (x!=0) {
            x/=10;
            count++;            
        }
        // System.out.println("The count is :"+count);
        return count;
    }

    public static int power(int a ,int b){
        int p=1;
        while(b!=0){
            p=p*a;
            b--;
        }   
        // System.out.println("the power"+p);
        return p;
    }




    public static int KaprekarNo(int n){
        if(n ==1 ) return 1;
        if (n ==10)  {
            return 0;
        }
        int square =n*n;
       int countOfSquare = countTheDigits(square);
      

        for (int i = 1; i <= countOfSquare; i++) {
            int first =square/power(10,i);
            int second =square%power(10,i);      
            
            
            if((first +second) == n){
                return 1;
            }
            
            
            if(first ==0 || second ==0) return 0;
        }
        
       
       return 0;
        
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            
            if(KaprekarNo(i)==1) System.out.print(i+" ");
            else System.out.print("");
        }

        scanner.close();
    } 
}
