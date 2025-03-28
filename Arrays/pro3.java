public class pro3 {


    

    // sort according to values 
    public static void main(String[] args) {
        int[] arr = new int[]{6,2,4,3,9,7};
   
       int temp=0;
        for (int i = 0,j=arr.length -1  ; j>0; ) {
            if((arr[j]%2==0)) {
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
