import java.util.Scanner;

// all MAGIC NO up to range

public class Program39 {
    

        public static int sumOfallDigits(int n){
                int sum =0,rem=0;
                while(n!=0){
                    rem = n%10;
                    n/=10;
                    sum +=rem;
                }
                return sum;
            }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
                
                while (num>9) {
                        num=sumOfallDigits(num);
                }
               System.out.println(num); 
        }
        

        scanner.close();
    } //   PRIME No check karfdghdfhfdgh
}
