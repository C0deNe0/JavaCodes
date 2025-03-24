import java.util.Scanner;

public class AllDigits {


public static void one(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if(  j==n/2 || i==n-1 || i+j==n/3 ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();  
    
            }
}


public static void two(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( j==0 && i>=n/2 || i==n-1 &&j<=n/2 ||i==n/2 && j<=n/2 || j==n/2 && i<=n/2 || i==0 && j<=n/2 ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();  
    
            }
}

public static void three(int n ){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( i==0 ||i==n-1 || j==n-1 || i==n/2 ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();  
    
            }
}


public static void four(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( i==n/2 || j==n/2 || i+j==n/2){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();  
    
            }
}

public static void five(int n){{
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( i==0 && j<=n/2 || j==0 && i<=n/2 || i==n/2 && j<=n/2 || j==n/2 && i>=n/2 || i==n-1 && j<=n/2 ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();  
    
            }
}}

public static void six(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( j==0 || i==0 && j<=n/2 || i==n-1 && j<=n/2 || j==n/2 && i>=n/2 || i==n/2 && j<=n/2){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();  
    
            }
}

public static void seven(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( i==0 && j>=n/4 && j<=n-1 || i+j ==n-1){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();  
    
            }
}


public static void eight(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( j==0 || j==3*n/4 || i==0 && j<=3*n/4 ||i==n-1 && j<3*n/4 || i==n/2 && j<=3*n/4  ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();  
    
            }
}


public static void nine(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( j==0 || j==n/2 || i==0 && j<=3*n/4 ||i==n-1 && j<3*n/4 || i==n/2 && j<=3*n/4  ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();  
    
            }
}

public static void zero(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( j==0|| j==3*n/4 || i==0 && j<=3*n/4 || i==n-1 && j<=3*n/4){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();  
    
            }
}

public static void skillbout(int n){
    int i,j;
    System.out.println();

    for ( i = 0; i < n; i++) {
        
        //S
        for ( j = 0; j < n; j++) {
            if( j==0 && i<=n/2 || i==n/2 && j<=n/2 || j<=n/2 && i==n-1 || i==0 && j<=n/2|| j==n/2 && i>=n/2){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.print( " ");
        
        //k
        for (j = 0; j < n; j++) {
            if( j==0|| i+j==n/2 || i-j ==n/2 ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.print(" ");  

        
        //i
        for ( j = 0; j < n; j++) {
            if( i==0 || i==n-1 || j==n/2){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.print(" ");  



        //l
          for ( j = 0; j < n; j++) {
                        if( j==0 || i==n-1 && j<=3*n/4 ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.print(" ");  
        //l
        for (j = 0; j < n; j++) {
            if( j==0 || i==n-1 && j<=3*n/4 ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.print(" ");  

        //b
        for ( j = 0; j < n; j++) {
            if( j==0 || i==0 || i==n-1 || j==n-1 || i==n/2  ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.print(" ");  


        //o

        for (j = 0; j < n; j++) {
            if( j==0 && i>n/4 && i<=3*n/4 ||j==n-1 && i>=n/4 && i<=3*n/4 || i==0  && j>n/4 && j<=3*n/4|| i==n-1 && j>n/4 && j<=3*n/4 || i-j == 3*n/4 || i-j == -3*n/4 || i+j == n/4 || i+j == 7*n/4){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.print( " ");  

        //u
        for (j = 0; j < n; j++) {
            if( j==0 && i<=3*n/4 || j==n-1 && i<= 3*n/4 || i==n-1 && j>=n/4 &&j<=3*n/4  || i-j==3*n/4 || i+j ==7*n/4){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.print( " ");  


        //t
        for (j = 0; j < n; j++) {
            if( i==0 || j==n/2){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();  
 
    }

}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =5;
        char alplha =scanner.nextLine().charAt(0);

        if(alplha =='!') skillbout(num);
        switch (alplha) {
            case '1': one(num); break;
            case '2': two(num); break;
            case '3': three(num); break;
            case '4': four(num); break;
            case '5': five(num); break;
            case '6': six(num); break;
            case '7': seven(num); break;
            case '8': eight(num); break;
            case '9': nine(num); break;
            case '0': zero(num); break;
        
            default:
                break;
        }
        scanner.close();
    }    
}
