import java.util.Scanner;

//Write a program to find the nth automorphic number.

public class Program56 {
    
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

        int i=1;
        while (num>0) {
            int res = automorphicNo(i);
            if(res ==1) num--;
            i++;            
        }
        System.out.println(i-1);

        scanner.close();
    } 
}
