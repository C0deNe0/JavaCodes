import java.util.Scanner;

public class AllAlphabets {

    //for a
    public static void a(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if( j==0 || i ==0 || j==n-1 || i==n/2){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();                
            }
 System.out.println("\n");
    }

    //  For b
    public static void b(int n){
            System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if( j==0 || i==0 || i==n-1 || j==n-1 || i==n/2  ){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println("\n");  

        }
    }

    public static void c(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if( i ==0 || j==0 || i==n-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println("\n");  

        }

    }

    public static void d(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if( j==0 || i==0 &&j <3*n/4 || i==n-1 && j<=3*n/4  || i-j==-3*n/4 || i+j == 8*(n/4) || j==n-1 && i>=n/4 && i<3*n/4 ){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();  

        }
    }


    public static void e(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                            if( j==0 || i==0 || i ==n/2 || i==n-1){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.println("\n");  
        
                }
    }

    public static void f(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                            if( j==0 || i ==0 || i==n/2 ){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.println("\n");  
        
                }
    }

public static void g(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( i==0 || j==0 || i ==n-1  ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println("\n");  
    
            }
}


public static void h(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( j==0 || j == n-1 || i==n/2){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println("\n");  
    
            }
}


public static void i(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( i==0 || i==n-1 || j==n/2){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println("\n");  
    
            }
}


public static void j(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if(i ==0|| j==n/2 ||i-j ==n/2 ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println("\n");  
    
            }
}


public static void k(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( j==0|| i+1 ==n/2 || i-j ==n/2 ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println("\n");  
    
            }
}


public static void l(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( j==0 || i==n-1 ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println("\n");  
    
            }
}

public static void m(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( j==0 || j==n-1 || i-j ==0 && j<n/2 || i+j ==n-1 && i<=n/2){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println("\n");  
    
            }
}



public static void n(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( j==0 || j==n-1 || i-j ==0 ){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println("\n");  
    
            }
}

public static void o(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( j==0 && i>n/4 && i<=3*n/4 ||j==n-1 && i>=n/4 && i<=3*n/4 || i==0  && j>n/4 && j<=3*n/4|| i==n-1 && j>n/4 && j<=3*n/4 || i-j == 3*n/4 || i-j == -3*n/4 || i+j == n/4 || i+j == 7*n/4){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();  
    
            }
}


public static void p(int n){
    System.out.println();
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if (j==0 || i==0 && j<=3*n/4 ||j==3*n/4 && i<=n/2 || i==n/2 && j<=3*n/4 ) {
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }System.out.println();
    }
}
 

public static void q(int n){
    System.out.println();

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
                if( j==0 && i<3*n/4 || j==n-1 && i<3*n/4 ||i==0 && j<3*n/4|| i==3*n/4 && j<3*n/4){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
                
        }
        System.out.println();
        
    }
}


public static void r(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( j==0|| j==n/2 && i<=n/2  || i==n/2 && j<n/2 || i-j == n/2){
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
        int n = 11;
        System.out.print("Enter a character  :");
        char alpha = scanner.next().charAt(0);

        switch (alpha) {
            case  'A', 'a' :   a(n); break;
             case 'B', 'b' :   b(n); break;
            case  'C', 'c' :   c(n); break;
            case  'D', 'd' :   d(n); break;
            case  'E', 'e' :   e(n); break;
            case  'F', 'f' :   f(n); break;
            case  'G', 'g' :   g(n); break;
            case  'H', 'h' :   h(n); break;
            case  'I', 'i' :   i(n); break;
            case  'J', 'j' :   j(n); break;
            case  'K', 'k' :   k(n); break;
            case  'L', 'l' :   l(n); break;
            case  'M', 'm' :   m(n); break;
            case  'N', 'n' :   n(n); break;
            case  'o', 'O' :   o(n); break;
            case  'P', 'p' :   p(n); break;
            case  'Q', 'q' :   q(n); break;
            case  'R', 'r' :   r(n); break;
            // case  'S', 's' :   s(n); break;
            // case  't', 'T' :   t(n); break;
            // case  'U', 'u' :   u(n); break;
            
        
            default:
                break;
        }
        scanner.close();
    }    
}
