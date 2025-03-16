import java.util.Scanner;

public class Fibonacci {


 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int a =0,b=1,sum=0;
        System.out.println("The fibonacci series is :");
        
        if(number == 0){
            System.out.println("Enter a number greater than zero");
        }
        if(number==1){
            System.out.println("0");
        }else{
            
            System.out.println("0\n1");
            for(int i=0;i<number-2;i++){
                sum=a+b;
                System.out.println(sum);
                a =b;
                b= sum;       
            }
        }
        scanner.close();
    }
}
