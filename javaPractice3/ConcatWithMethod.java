import java.util.Scanner;

public class ConcatWithMethod {
   
    public  static int concatt(int n, int m){
        int length =0;
        int temp =m;
        if(m!=0){
            m= m/10;
            length++;
        }
       

        int power =1;
        for(int i=0;i<=length;i++){
            power *=10;
        }
        // System.out.println(power);
        int result = n*power + temp;

        return result;
    }


    public static int replacee(int n,int m){

        int length =0;
        int temp =m;

        while(m!=0){
            m=m/10;
            length++;
        }

        // System.out.println(length);                                      TESTING
 
        int power =1;
        for(int i=0;i<=length-1;i++){
            power *=10;
        }

        // System.out.println(power);                                      TESTING


        n =n/power;
        n = n*power;
     int result2= n +temp;
    



        return result2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = concatt(a,b);
        System.out.println("The result 1: "+ result);

        // System.out.println(a+"and"+b);                               TESTING

        int result2 = replacee(a,b);
        System.out.println("The result 2: "+ result2);

        scanner.close();
    }    
}
