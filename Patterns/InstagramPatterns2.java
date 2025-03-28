import java.security.PublicKey;

public class InstagramPatterns2 {

    public static void pat21(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                            if(i-j<=0 ){
                                System.out.print((char)('A'+i-j+n-1 )+" ");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println();  
        
                }
    }



    public static void pat22(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                            if (i<=n/2) {
                                if(i+j>=n-1){
                                    System.out.print("* ");
                                }
                                else{
                                    System.out.print(" ");
                                }
                            }
                            else{
                                if(i-j<=0){
                                    System.out.print("* ");
                            }else{
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println();  
                }     
    }


    public static void pat23(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                            if (i<=n/2) {
                                if(i+j>=n-1){
                                    System.out.print(i+1+" ");
                                }
                                else{
                                    System.out.print(" ");
                                }
                            }
                            else{
                                if(i-j<=0){
                                    System.out.print(n-i+" ");
                            }else{
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println();  
                }    
    }


    public static void pat24(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                           if(i+j>=n-1 && i-j<=0){
                            System.out.print( ( i>=n/2 ?n- (- (i-j))  : n-((i+j)-(n-1)) ) +" ");
                           }
                           else{
                            System.out.print(" ");
                           }
                        }
                        System.out.println();  
                    }
                }
                
    public static void pat25(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                            if (i<=n/2) {
                                if(i+j>=n-1){
                                    System.out.print(i+j-(n-1)+1+" ");
                                }
                                else{
                                    System.out.print(" ");
                                }
                            }
                            else{
                                if(i-j<=0){
                                    System.out.print(j-2+" ");
                            }else{
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println();  
                }    
    }

    public static void pat26(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                            if (i<=n/2) {
                                if(i+j>=n-1){
                                    System.out.print((char)(65+i)+" ");
                                }
                                else{
                                    System.out.print(" ");
                                }
                            }
                            else{
                                if(i-j<=0){
                                    System.out.print((char)(65+n-i-1)+" ");
                            }else{
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println();  
                }  
    }
    

    public static void pat27(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                            if (i<=n/2) {
                                if(i+j>=n-1){
                                    System.out.print((char)(65+i+j-(n-1))+" ");
                                }
                                else{
                                    System.out.print(" ");
                                }
                            }
                            else{
                                if(i-j<=0){
                                    System.out.print((char)(65+j-n/2)+" ");
                            }else{
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println();  
                }  
    }

    public static void pat28(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
              
                    for (int j = 0; j < 2*n; j++) {
                           
                            if(i+j==n-1 ||i-j==-(n-1) ){
                                System.out.print("* ");
                           }else{
                            System.out.print(" ");
                           }
                          
                    
                }  
                   System.out.println();  
            }
    }


    public static void pat29(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
              
                    for (int j = 0; j < 2*n; j++) {
                           
                            if(i+j==n-1 ||i-j==-(n-1) ){
                                System.out.print(i+1+" ");
                           }else{
                            System.out.print(" ");
                           }
                          
                    
                }  
                   System.out.println();  
            }
    }


    public static void pat30(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
              
                    for (int j = 0; j < 2*n; j++) {
                           
                            if(i+j==n-1 ||i-j==-(n-1) ){
                                System.out.print(n-i+" ");
                           }else{
                            System.out.print(" ");
                           }
                          
                    
                }  
                   System.out.println();  
            }
    }


    public static void pat31(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
              
                    for (int j = 0; j < 2*n; j++) {
                           
                            if(i+j==n-1 ||i-j==-(n-1) ){
                                System.out.print((char)(65+i)+" ");
                           }else{
                            System.out.print(" ");
                           }
                          
                    
                }  
                   System.out.println();  
            }
    }


    public static void pat32(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
              
                    for (int j = 0; j < 2*n; j++) {
                           
                            if(i+j==n-1 ||i-j==-(n-1) ){
                                System.out.print((char)(65+n-i-1)+" ");
                           }else{
                            System.out.print(" ");
                           }
                          
                    
                }  
                   System.out.println();  
            }
    }


    public static void pat33(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
              
                    for (int j = 0; j < 2*n; j++) {
                           
                            if(i-j==0 ||i+j==2*(n-1) ){
                                System.out.print("* ");
                           }else{
                            System.out.print(" ");
                           }
                          
                    
                }  
                   System.out.println();  
            }
    }

    public static void pat34(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
              
                    for (int j = 0; j < 2*n; j++) {
                           
                            if(i-j==0 ||i+j==2*(n-1) ){
                                System.out.print(i+1+" ");
                           }else{
                            System.out.print(" ");
                           }
                          
                    
                }  
                   System.out.println();  
            }
    }

    public static void pat35(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
              
                    for (int j = 0; j < 2*n; j++) {
                           
                            if(i+j==2*(n-1) ||i-j==0 ){
                                System.out.print(n-i+" ");
                           }else{
                            System.out.print(" ");
                           }
                          
                    
                }  
                   System.out.println();  
            }
    }

    public static void pat36(int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
              
                    for (int j = 0; j < 2*n; j++) {
                           
                            if(i+j==2*(n-1) ||i-j==0 ){
                                System.out.print((char)(65+i)+" ");
                           }else{
                            System.out.print(" ");
                           }
                          
                    
                }  
                   System.out.println();  
            }
    }
    public static void main(String[] args) {
        // pat21(5);
        // pat22(7);
        // pat23(7);
        // pat24(7);
        // pat25(7);
        // pat26(9);
        // pat27(9);
        // pat28(4);
        // pat29(4);
        // pat30(5);
        // pat31(7);
        // pat32(7);
        // pat33(5);
        pat34(5);
        pat35(5);
        pat36(5);
    }
}
