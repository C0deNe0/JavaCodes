import java.util.Scanner;


// wsap to find all evil no upto range 
public class Program47 {
    
    public static int evilNo(int n){
        int count =0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }


public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            if(evilNo(i)%2==0) System.out.print(i+" ");
            else System.out.print("");
        }

        scanner.close();
    } //   PRIME No check kar

}
