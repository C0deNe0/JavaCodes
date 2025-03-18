
//all abundant integers in a range 

import java.util.Scanner;

public class Program37 {
    
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
    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            if (checkAbundantNo(i)==1) {
                System.out.print(i+" ");
            }
            else{
                System.out.print("");
            }
        }

        scanner.close();
    } //   PRIME No check kar
}

