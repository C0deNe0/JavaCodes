
//all pronic number upto range

import java.util.Scanner;

public class Program45 {
    

    public static int pronicNo(int n){
        
        if(n==0){
            return 1;
        }
        for(int i=0;i<n/2;i++){
            if( i*(i+1)==n ){
                return 1;
            }
        }
        return 0;
     }
     
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            if(pronicNo(i)==1) System.out.print(i + " ");
            else System.out.print("");
        }

        scanner.close();
    } //   PRIME No check kar
}
