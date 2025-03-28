

//sort according to indexW

public class Pro2 {



    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,5};
   
       int temp=0;
        for (int i = 1,j=arr.length -1  ; j>0; ) {
            if(j%2==0) {
                 temp =arr[j];
                arr[j] = arr[i];
                arr[i] =temp;  
                i++;
            }
            j--;  
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }    
}
