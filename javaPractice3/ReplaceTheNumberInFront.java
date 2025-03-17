import java.util.Scanner;

public class ReplaceTheNumberInFront {

    public  int reverse(int x){
        int rem=0,rev =0;
        while(x!=0){
            rem = x%10;
            x = x/10;
            rev = rev*10 +rem; 
        }
        return rev;
    }


   public static int getReplaced(int a ,int b){
       int temp =b;
    int length = 0;
    while (b!=0) {
        b= b/10;
        length++;    
    }

    int power = 1;
    for(int i = 0; i<length;i++){
        power *= 10;
    }
    // System.out.println(power);                                     TESTING
    
    a = a/power;
    // System.out.println(a);                                         TESTING

    int res = a*power + temp;
    return res;

    }


    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ReplaceTheNumberInFront t = new ReplaceTheNumberInFront();

      System.out.println("Enter the numbers : ");
      int a = scanner.nextInt();
      int b = scanner.nextInt();
        
      int revA = t.reverse(a);
      int revB = t.reverse(b);

        // System.out.println(revA);
      int initalResult = getReplaced(revA,revB);

      System.out.println("The resultant is : "+t.reverse(initalResult));

      scanner.close();
    }
}
