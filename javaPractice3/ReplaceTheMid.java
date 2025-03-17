import java.util.Scanner;

public class ReplaceTheMid {

        public static int power(int length){
            int power=1;
                 for(int i=0;i<length;i++){
                     power *= 10;
                    }
            return power;
            }

            public static int power( int a , int b){
                 
                while(b>0){
                    a +=a;
                    b--;
                }
                
                return a;

            }

        public static int length(int a){
            int count =0;
            while (a!=0) {
                a= a/10;
                count++;
            }
            return count;
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Numbers: ");
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(power(a, b));



    }
}
