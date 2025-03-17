import java.util.Scanner;

public class FirstNumberMethod {


    public int firstno(int num){
     
        while(num>9){
            num = num/10;
         }
        return num;
    }
  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int temp =num;
        FirstNumberMethod t = new FirstNumberMethod();

        int count=0;
        int power=1;

        while(num!=0) {
            num = num/10;
            count++;   
        }
        
        for(int i=0;i<count-1;i++){
            power *=10;
        }
        // System.out.println(power);

        int firstNumber = t.firstno(temp);


        int remainging = temp - firstNumber*(power);                                //  The remaining FORMULA
        System.out.println("The first digit is : "+firstNumber);
        System.out.println("The remaning numbers are : "+remainging);
        scanner.close();
    }    
}
