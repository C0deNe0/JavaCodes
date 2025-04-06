public class LenghtAtTheLastOfWord {

    static void Display(char[] ch) {
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]+" ");
        System.out.println();
        System.out.println();
    }

    static void tostr(char[] ch){
        String s ="";
        for (int i = 0; i < ch.length; i++) {
            s+=ch[i];
        }
        System.out.println(s);
    }

    static void LengthAtlast(char[] ch){
        int len =0;
        for (int i = 0; i < ch.length; i++) {
           if(ch[i]!=' '){
                len++;
            }else{
                ch[i-1] = (char)(48+len);
                len =0;
            }

        }
        
        Display(ch);
        tostr(ch);

        
    }

    public static void main(String[] args) {
        String str = "What is your name ";
        char ch[] = str.toCharArray();

        Display(ch);
        LengthAtlast(ch);
    }
}
