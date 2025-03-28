import java.util.Scanner;

//Write a Program to check whether the number is Sunny Number or Not.
/*A sunny number in programming is defined as a number where adding one to the number results in a perfect square. For example, 8 is a sunny number because 8 + 1 equals 9, and 9 is a perfect square (3)^2 ).
 This concept is used in various programming languages to check if a given number meets this criterion. */


public class Program25 {
    
    public static int checkPerfectSquare(int n){
        int i=0;
        int count =0;

        while (!(i*i==n)) {
            if(count>100){
                // System.out.println("NOT a perfect sqaure");
                return 0;
            }
            count++;
            i++;
        }
        System.out.println(i);
        return i;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

       if(checkPerfectSquare(num+1)==0){
        System.out.println("Not a sunny number");
       }else{
            System.out.println("It is a sunny number");
       }

      

        scanner.close();
    } //   PRIME No check kar
}
