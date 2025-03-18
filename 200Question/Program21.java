
// FRIENDLY NUMBERS 

import java.util.Scanner;

public class Program21 {
    
    public static int sumOfallDevisors(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum;
    }
    public static void friendlyNo(int a, int b){
        if((sumOfallDevisors(a)/a)==(sumOfallDevisors(b)/b)){
            System.out.println(a +" and "+ b+ " are Friendly pair.");
        }
        else{
            System.out.println("They are not a friendly pair");
        }
    }

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        friendlyNo(num1,num2);
        scanner.close();
    } //   PRIME No check kar

}
