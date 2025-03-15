public class first {
    


    public static void main(String[] args) {
      int a=10,b=12;

      int sum = a +b;
      int difference = a-b;
      int multiple = a*b;
      int division = a/b;
      int remainder = a%b;
      
      System.out.println("sum is "+sum+"\ndifference :"+difference+"\nmultiplication :"+multiple+"\ndivision:"+division+"\nremainder:"+remainder);

      int person = 14;
      if(person < 18){
        System.out.printf("Not Authorized: Grow up!!!");
      }else{
        System.out.println("You are 18 above!!");
      }


      int number = 12;
      if(number%2 ==0){
        System.out.println("The"+number+"is Even");
      }else{
        System.out.println(number+" is odd");
      }

      System.out.println("\nPrinting number from 1 to 10:");
      for(int i=0;i<=10;i++){
        System.out.println(i);
      }
 
}}
