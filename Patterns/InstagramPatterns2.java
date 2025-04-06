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

    
static void pat37( int x){

    for(int i=0;i<x;i++){
        for(int j=0;j<(2*x)-1;j++){
            if(i+j==(2*(x-1))||i-j==0){
                System.out.print((char)('A'+(x-i-1))+" ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}

static void pat38( int n){
    int x=n*2-1;
    for(int i=0;i<x;i++){
        for(int j=0;j<(2*x)-1;j++){
            if(i<=x/2&&(i+j==x-1||i-j==-(x-1))||(i>=x/2&&(i-j==0||i+j==2*(x-1)))){
                System.out.print("* ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}


static void pat39( int n){
    int x=n*2-1;
    for(int i=0;i<x;i++){
        for(int j=0;j<(2*x)-1;j++){
            if(i<=x/2&&(i+j==x-1||i-j==-(x-1))||(i>=x/2&&(i-j==0||i+j==2*(x-1)))){
                System.out.print((i<=x/2?1+i:x-i)+" ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}

static void pat40( int n){
    int x=n*2-1;
    for(int i=0;i<x;i++){
        for(int j=0;j<(2*x)-1;j++){
            if(i<=x/2&&(i+j==x-1||i-j==-(x-1))||(i>=x/2&&(i-j==0||i+j==2*(x-1)))){
                System.out.print((i<=x/2?n-i:i-n+2)+" ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}



static void pat41( int n){
    int x=n*2-1;
    for(int i=0;i<x;i++){
        for(int j=0;j<(2*x)-1;j++){
            if(i<=x/2&&(i+j==x-1||i-j==-(x-1))||(i>=x/2&&(i-j==0||i+j==2*(x-1)))){
                System.out.print((char)(i<=x/2?'A'+i:'A'+(x-i-1))+" ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}



static void pat42( int n){
    int x=n*2-1;
    for(int i=0;i<x;i++){
        for(int j=0;j<(2*x)-1;j++){
            if(i<=x/2&&(i+j==x-1||i-j==-(x-1))||(i>=x/2&&(i-j==0||i+j==2*(x-1)))){
                System.out.print((char)(i<=x/2?'A'+(n-i-1):'A'+(i-n+1))+" ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}


static void pat43( int x){

    for(int i=0;i<x;i++){
        for(int j=0;j<(2*x)-1;j++){
            if(i+j<=x-1||i-j<=-(x-1)){
                System.out.print("* ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}



static void pat44( int x){

    for(int i=0;i<x;i++){
        for(int j=0;j<(2*x)-1;j++){ 
            if(i+j>=(2*(x-1))||i-j>=0){
                System.out.print("* ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}

static void pat46( int x){

    for(int i=0;i<x;i++){
        for(int j=0;j<(2*x)-1;j++){ 
            if(i+j>=(2*(x-1))||i-j>=0){
                System.out.print("  * ");
            }    
            else{
                System.out.print("   ");
            }      
        }
        System.out.println();
    }

}


static void pat47( int x){

    for(int i=0;i<x;i++){
        for(int j=0;j<(2*x)-1;j++){ 
            if(i+j>=x-1&&i-j>=0||i+j>=2*(x-1)&&i-j>=-(x-1)){
                System.out.print("* ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}


<<<<<<< HEAD
    public static void pat48(int n) {
     n=9;
    for(int i=0;i<n;i++){
    for(int k=0;k<5;k++){
    for(int j=0;j<n;j++){
    if(i+j==n/2 || i-j==-n/2)
    System.out.print((char)(65+((n*k)+j)%26));
    else
    System.out.print(" ");
    }
    }
    System.out.println();
    }
    }
    
    

=======
>>>>>>> 5891bf9dc981893b168b691ad08e4c1b155cfa5f
static void pat49( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i+j==(x-1)||i-j==0){
                System.out.print("* ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}


static void pat50(  int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i+j==(x-1)||i-j==0){
                System.out.print(1+i+" ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}


static void pat51( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i+j==(x-1)||i-j==0){
                System.out.print(x-i+" ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}



static void pat52( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i+j==(x-1)||i-j==0){
                System.out.print(1+j+" ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}


static void pat53( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i+j==(x-1)||i-j==0){
                System.out.print(x-j+" ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}


static void pat54( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i+j==(x-1)||i-j==0){
                System.out.print((char)('A'+i)+" ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}


static void pat55( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i+j==(x-1)||i-j==0){
                System.out.print((char)('A'+j)+" ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}




static void pat56( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i-j==0){
                System.out.print("0 ");
            }    
            else{
                System.out.print("* ");
            }      
        }
        System.out.println();
    }

}



static void pat57( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i-j<=0){
                System.out.print("0 ");
            }    
            else{
                System.out.print("* ");
            }      
        }
        System.out.println();
    }

}


static void pat58( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i-j==0||i+j==x-1){
                System.out.print("* ");
            }    
            else{
                System.out.print("0 ");
            }      
        }
        System.out.println();
    }

}


static void pat59( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i==x/2&&j==x/2){
                System.out.print("0 ");
            }    
            else{
                System.out.print("* ");
            }      
        }
        System.out.println();
    }

}

static void pat60( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i==x/2||j==x/2){
                System.out.print("* ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}


static void pat61( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i==x/2||j==x/2){
                System.out.print("* ");
            }    
            else{
                System.out.print("0 ");
            }      
        }
        System.out.println();
    }

}

static void pat62( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i+j>=x/2&&i+j<=x-1&&i<3*((x/4))){
                System.out.print("* ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

    }

    static void pat72( int x){
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||j==0||i==x-1||j==x-1){
                    System.out.print("* ");
                }    
                else{
                    System.out.print("  ");
                }      
            }
            System.out.println();
        }

    }

    
static void pat73( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(i==0||j==0||i==x-1||j==x-1){
                System.out.print("* ");
            }    
            else{
                System.out.print("# ");
            }      
        }
        System.out.println();
    }

}


static void pat74( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(j==0||i==x-1||i-j==0){
                System.out.print("* ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}

static void pat75( int x){
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            if(j==0||i==x-1||i-j==0||i==0||j==x-1||i+j==x-1){
                System.out.print("* ");
            }    
            else{
                System.out.print("  ");
            }      
        }
        System.out.println();
    }

}

static void pat76( int x){

    for(int i=0;i<x;i++){
        int k=1;
        for(int j=0;j<x;j++){ 
            if(j%2==0){
                System.out.print(1+i+" ");
            }    
            else{
                System.out.print(k+" ");
                k++;
            }     
        }
        System.out.println();
    }

}

static void pat77( int x){

    for(int i=0;i<x;i++){
        int k=1;
        for(int j=0;j<x;j++){ 
            if(j%2!=0){
                System.out.print(1+i+" ");
            }    
            else{
                System.out.print(k+" ");
                k++;
            }     
        }
        System.out.println();
    }

}


static void pat78( int x){

    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){ 
            if(i==x/2||j==x/2||i-j==-x/2||i-j==x/2||i+j==x/2||i+j==3*(x/2)){
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
        // pat34(5);
        // pat35(5);
        // pat36(5);
        // pat37(5);
        // pat38(5);
        // pat39(5);
        // pat40(5);
        // pat41(5);
        // pat42(5);
        // pat43(5);
        // pat44(5);
        // pat46(5);
        // pat47(5);
<<<<<<< HEAD
        // pat48(9);
=======
>>>>>>> 5891bf9dc981893b168b691ad08e4c1b155cfa5f
        // pat49(5);
        // pat50(5);
        // pat51(5);
        // pat52(5);
        // pat53(5);
        // pat54(5);
        // pat55(5);
        // pat56(5);
        // pat57(5);
        // pat58(5);
        // pat59(5);
        // pat60(5);
        // pat61(5);
            // pat62(7);
            // pat63(7);
            // pat64(7);
            // pat65(7);
            // pat66(7);
            // pat67(7);
            // pat68(7);
            // pat69(7);
            // pat70(7);
            // pat71(7);
            // pat72(7);
            // pat73(7);
            // pat74(7);
            // pat75(7);
            // pat76(7);
            // pat77(7);

    }
}
