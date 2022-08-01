//import java.util.*;
class prodOfTwo{
    static int maxProduct(int[] arr){
        int a=arr[0];
        int b=arr[1];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]*arr[j] > a*b) a=arr[i];b=arr[j];
            }
        }
        return a*b;
    }
    public static void main(String[] args){
        int[] arr={1,9,3,4,5,6};
        System.out.print(maxProduct(arr));
    }
}