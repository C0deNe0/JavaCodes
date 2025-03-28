
//To print all automorphic number present in the range 

import java.util.Scanner;

public class Program38 {
    
    public static int power(int a ,int b){
        int p=1;
        while(b!=0){
            p=p*a;
            b--;
        }  
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

    public static int automorphicNo(int num){
        int square=num*num;
        if( square% power(10, countTheDigits(num))==num){
             return 1;
        }else{
        return 0;
        }
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            if(automorphicNo(i)==1) System.out.print(i+" ");
            else System.out.print("");
        }



        scanner.close();
    } //   PRIME No check kar
}
