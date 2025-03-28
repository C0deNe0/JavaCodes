import java.util.Scanner;


// Add the second number between the first number
public class AddingInTheMiddle {
    
    public static int length(int a){
        int count =0;
        while (a!=0) {
            a= a/10;
            count++;
        }
        return count;
    }

    public static int halfPower(int length){
            int power=1;
        for(int i=0;i<length/2;i++){
            power *= 10;
        }
        return power;
    }


    public static int power(int length){
        int power=1;
    for(int i=0;i<length;i++){
        power *= 10;
    }
    return power;
}

    public static int addInMid(int a,int b){
        int temp = a;


        int len1 = length(a);
        // int len2 = length(b);

        

        int first = temp / halfPower(len1);
        int second = temp % halfPower(len1);
        
    //    System.out.println(first);
    //    System.out.println(second);
    
      b = b * power(length(second));
      first = first * power(length(b));

      return first + b + second;

        
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int res = addInMid(x,y);
        System.out.println(res);
    scanner.close();
    }

}
