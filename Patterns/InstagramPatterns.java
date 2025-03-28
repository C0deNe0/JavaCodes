public class InstagramPatterns {
    
public static void pat1(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                            if( j==0 || i-j >=0 && i<=n/2 || i+j<=n-1 && i>=n/2 ){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.println();  
        
                }

    }

public static void pat2(int n){
    
    
        System.out.println();
    
        for (int i = 0; i < n; i++) {
            for (int j = n-1; i+j-n >=0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // System.out.println();

        for (int i = 0; i < n; i++) {
                    for (int j = n-1; i-j <= 0; j--) {
                           System.out.print(j+" "); 
        }
        System.out.println();
    }
    System.out.println();
}

public static void pat3(int n){
       int j,i;
    
    System.out.println();
    
    for ( i = 0; i < n; i++) {
        for ( j = n-1; i+j-n >=0; j--) {
            System.out.print(i+" ");
        }
        System.out.println();
        // System.out.println();
    }


}

public static void pat4(int n){
   
    for (int i = 0; i <= 2*n; i++) {
        
        for (int j = 0; j <= n; j++) {
        if(i<=n){

                if(i-j>0){
                    System.out.print((char)(65+n-1-j)+" ");
                }else{
                    System.out.print("  ");
                }
            }
            else if(i>n){
                
                    if(i+j<=2*n-1){
                        System.out.print((char)(65+n-1-j)+" ");
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
            
            
        }
     }

    
   public static void pat5(int n){
    int i,j;
        for( i=0;i<n;i++){

         if(i<=n/2){ 
            for( j=0;j<2*n;j++){
                if( i-j>=0){
                    System.out.print((char)('A'+n-i+j)+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        else{
            for ( j = 0; j < n; j++) {
                if(i+j<n){
                    System.out.print((char)('A'+1+i+j)+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    
    
    }
}

public static void part6(int n){
  
    for(int i=0;i<n;i++){
       
       
        for(int j=0;j<n;j++){
       
       if(i<=n/2){

           if(i+j+1>=n ){
               
               System.out.print("*"+" ");
            }else{
                System.out.print(" "+" ");
            }
        }
        else{
            if(i-j<1 ){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        }
        System.out.println();
    }
}

public static void part7(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if( i+j >=n-1&& i<=n/2 || i-j<=0 && i>n/2){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();;
    }
}


public static void part8(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if (i+j >=n-1&& i<=n/2 || i-j<=0 && i>n/2) {
                System.out.print(j-n/2+" ");
            }else{
                System.out.print( "  ");
            }
        }
        System.out.println();
    }
}
public static void part9(int n){
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i+j >=n-1&& i<=n/2 || i-j<=0 && i>n/2) {
                System.out.print((char)('D'+j-n/2-3)+" ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}

public static void part10(int n){
    for (int i = 0; i < n; i++) {
       for (int j = 0; j < n; j++) {
            if(i+j >=n-1&& i<=n/2 ){
                System.out.print((char)(65+n/2-i-j+n-1)+" ");
            }else if( i-j<=0 && i>n/2){
                System.out.print((char)(65+n/2-j+i)+" ");
            }else{
                System.out.print("  ");
            }
       } 
       System.out.println();
    }
}

public static void part11(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i<=n/2 && i+j>=n/2 && i-j>=-n/2){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}


public static void pat12(int n){
    for(int i=1;i<=n ;i++){
        for (int j = 0; j <n; j++) {
                if( i<=n/2 && !(i+j <=n/2) &&(i-j>-n/2)){
                    System.out.print(i+" ");
                }else{
                    System.out.print("  ");
                }
                
        }
        System.out.println();
    }
}

public static void pat13(int n){
    for (int i = 1; i < n; i++) {
        for (int j = 1; j <n; j++) {
                if(i+j>n/2 && i-j>-n/2 && i<=n/2){
                        System.out.print(i+j-n/2+" ");
                }else{
                    System.out.print("  ");
                }


        }
        System.out.println();
    }
}

public static void pat15(int n){
    for (int i = 0; i < n; i++) {
    
        for (int j = 0; j < n; j++) {
            
            if(i+j>=n-1)  {
                System.out.print((char)(65+j)+" ");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

public static void pat14(int n){
    for (int i = 0; i < n; i++) {
      
        for (int j = 0; j < n; j++) {
            if(i+j>=n-1)  {
                System.out.print((char)(65+i)+" ");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

public static void pat16(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( i-j <= 0){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();  
    
            }
}

public static void pat17(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if(i-j <= 0 ){
                            System.out.print(n-i+" ");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();  
    
            }
}

public static void pat18(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if(i-j <= 0 ){
                            System.out.print(n-j+" ");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();  
    
            }
}

public static void pat19(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if(i-j <= 0 ){
                            System.out.print((char )(65+n-i-1)+" ");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();  
    
            }
}

public static void pat20(int n){
    System.out.println();
    for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                        if( i-j<=0){
                            System.out.print((char )(65+n-j-1)+" ");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();  
    
            }
}
public static void main(String[] args) {
        
        // pat1(7);
        // pat2(4);
        //  pat3(5);
        // pat4(4);
        // pat5(13);
        // part6(9);
        // part7(9);
        // part8( 11);
        // part9(11);
        // part10(7);
        // part11(9);
        // pat12(10);
        // pat13(7);
        // pat14(5);
        // pat15(7);
        // pat16(7);
        // pat17(5);
        // pat18(5);
        // pat19(5);
        // pat20(5);
    }
}
