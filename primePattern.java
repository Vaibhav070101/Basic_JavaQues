import java.util.*;
public class primePattern{
    public static boolean isPrime(int n){
        if(n==0 || n==1) return false;
        
        int sq=(int)Math.sqrt(n);
        for(int i=2;i<=sq;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    
    public static void printPattern(int[] arr){
        int count=0;
        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                // int count=0;
                System.out.print(arr[count++]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        int num=100;
        int[] arr=new int[num];
        int count=0;
        for(int i=1;i<=num;i++){
            if(isPrime(i)){
                // System.out.print(i+" ");
                arr[count++]=i;
            }
        }
        //  for(int i=0;i<arr.length;i++){
        //      System.out.print(arr[i]+" ");
        //  }
        printPattern(arr);
    }
}