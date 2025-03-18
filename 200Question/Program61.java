
//Write a Program to Find nth Sunny Number.


/// ISKO Wapas karna hain

import java.util.Scanner;

public class Program61 {
    
    public static int checkPerfectSquare(int n){
        int i=0;
        int count =0;

        while (!(i*i==n)) {
            if(count>100){
                return 0;
            }
            count++;
            i++;
        }
        // System.out.println(i);
        // return i;
        if(i!=0) return 1;
        else return 0;
    }


public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        int i=0;
        while (num>0) {
            int res = checkPerfectSquare(i+3);   
            if(res==1) num--;
            i++;
        }
        System.out.println(i+1);                         ////WHY i-2  check kar
        

        scanner.close();
    } 
}
