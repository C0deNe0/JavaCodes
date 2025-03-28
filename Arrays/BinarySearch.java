public class BinarySearch {


    public static boolean binarySearch(int[]a ,int target){
        int n =a.length;
        int start=0,end=n-1;
        while(start<end){
            int mid = (start + end)/2;
            if(target ==a[mid]) return true;
            else if(target < a[mid]) end--;
            else  start++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,5,6};
        int target= 4;

        System.out.println(binarySearch(a,target));
    }
}
