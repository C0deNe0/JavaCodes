import java.util.Scanner;

//Write a Program to Find nth Spy Number.

public class Program59 {
    
    public static int sumOfallDigits(int n){
        int sum =0,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            sum +=rem;
        }
        return sum;
    }


    public static int productOfAllDigits(int n){
        int mul =1,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            mul*=rem;
        }
        return mul;
    }

    public static int spyNo(int x){
        if(sumOfallDigits(x)==productOfAllDigits(x)){
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
            if(spyNo(i)==1) num--;
            i++;
        }
        System.out.println(i-1);
        scanner.close();
    } 
}
