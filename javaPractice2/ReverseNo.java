import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int remainder=0,reverse=0;
         while(num!=0){
            remainder = num%10;
            num = num/10;
            reverse = reverse*10+remainder;
            
        }

        System.out.println("The reverse of this number is :"+reverse);
        scanner.close();
    }    
}
