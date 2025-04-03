public class ReplaceFirstAndLast {

    static void Display(char[] ch){

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");
        }
        System.out.println();
    }


    static void toStr(char[] ch){
        String s="";
        for (int i = 0; i < ch.length; i++) {
            s+=ch[i];
        }
        System.out.println(s);
    }


    static void ReplaceThem(char[] s){
        int len = s.length;
        int i=0;
        int start =0;        
        while(len>0){
        
        if(s[i]==' '){

            char temp = s[start];
            s[start] = s[i-1];
            s[i-1] = temp;
            start+=2;
        } 
          
            i++;
            len--;
        }
    }

    public static void main(String[] args) {
        String str = "what is your name";
        char[] ch = str.toCharArray();

        Display(ch);
        ReplaceThem(ch);
    }
}
