
public class methodPractice {
    
    public int max(int x, int y){
        return x>y?x:y;
    }
    public int max(int x,int y,int z){
        if(x>y && x>z) return x;
        else if( y>z) return y;
        else return z;
    }
    public static void main(String[] args) {
        methodPractice t = new methodPractice();
        System.out.println(t.max(3 , 5));
        System.out.println(t.max(44,50,30));


    }

}
