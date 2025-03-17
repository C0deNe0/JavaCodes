import java.util.Scanner;

public class Extra5Questions {

    public int length(int a){
        int count =0;
        while(a!=0){
            a/=10;
            count++;
        }
        return count;
    }


    public static int power(int a ,int b){
        int temp =a;
        while(b/2>0){
            a= temp*a;
            b--;
        }
        return a;
    }

    public static int reverse(int x){
        int rem=0,rev=0;
        while(x!=0){
            rem = x%10;
            x = x/10;
            rev= rev*10+rem;
        }
        return rev;
    }


    public static int evenNos(int n){

        int count =0;
        int rem =0;
        System.out.println("The even numbers are: ");
        while(n!=0){
            rem = n%10;
            n = n/10;
            // System.out.println("The even numbers are: "+count);
            if(rem%2==0){
                System.out.print(rem+" ");
                count++;
            }   
        }
        System.out.println("\nThe number of even numbers : "+count);  
        return count;       
    }


    public static int oddNos(int n){

        int count =0;
        int rem =0;
        System.out.println("The Numbers of odd numbers :");
        while(n!=0){
            rem = n%10;
            n = n/10;
            if(!(rem%2==0)){
                System.out.print(rem+" ");
                count++;
            }   
        }
        System.out.println("\nThe number of odd numbers : "+count);  
        return count;       
    }



        public static int evenOddEncoding(int a){
            
            int rem =0,rev=0;
            a = reverse(a);
            System.out.print("The Encoded number is: ");
            while(a>0){
                rem = a%10;
                a /=10;
                if(rem%2==0){
                    rem=0;
                    System.out.print(rem);
                }
                else{
                    rem=1;
                    System.out.print(rem);
                }
            }
            //             Various algo TRIED
            
            // rev = rev*10 +rem;
            // int nrev = reverse(rev);
            // System.out.println("The encoded value of "+a+" is "+rev);

            return rev;
        }



        public static int maxDigit(int a ){
            int digit=0;
            int rem=0;
            while(a!=0){
                rem = a%10;
                a /= 10;
                if(rem>digit){
                    digit = rem;
                }
            }
              return digit;
        }


        public static int minDigit(int a){
            int rem=0;
            int digit=a%10;;
            while(a!=0){
                rem = a%10;
                a /= 10;
                if(rem<digit){
                    digit = rem;
                }
            }
              return digit;
        }


        public static int sumOfDigit(int x){
            int rem=0,sum=0;
            while (x!=0) {
                rem = x%10;
                x/=10;
                sum = sum + rem;
            }
            return sum;
        }


        public static int multipleOfDigit(int y){
            int rem=0,mul=1;
            while(y>0){
                rem= y%10;
                y/=10;
                mul = mul*rem;
            }
            return mul;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("The power:"+power(n1,n2));
        System.out.println("The reverse:"+reverse(1));
        evenNos(n1);
        oddNos(n1);
        evenOddEncoding(n1);
        System.out.println("The max digit is :" + maxDigit(n1));
        System.out.println("The min digit is :" + minDigit(n1));
        System.out.println("The min digit is :" + sumOfDigit(n1));
        System.out.println("The min digit is :" + multipleOfDigit(n1));

    scanner.close();
    }

}
