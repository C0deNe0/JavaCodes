/*
5Square=25,end with 5
6Square=36,end with 6
number Square ends with itself
*/

import java.util.Scanner;
public class Main
{
    static int NumberLength(int x){
        int rtn=0;//initailzation
        while(x>0){//codition
            x=x/10;//increment:update
            rtn++;//count
        }
        return rtn;
    }
    static int ANumber(int x, int y){
        int rn,rtn=x%10,u=1;
        x=x/10;
        for(int i=0;i<y-1;i++){
            rn=x%10;
            u=u*10;
            rtn=rtn+rn*u;
            x=x/10;
        }
        return rtn;
    }
	public static void main(String[] args) {
	   
    	
	}
}
