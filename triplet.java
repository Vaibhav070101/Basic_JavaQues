import java.util.*;
public class triplet
{
    public boolean findTriplet(int[] arr, int len, int sum){
        
        //fixing the first element of the array and traversing through the rest
        for(int i=0;i<len-2;i++){
            //fixing the second element of the array
            for(int j=i+1;j<len-1;j++){
                //after fixing the first two elemets find third helping to get the sum....
                for(int k=j+1;k<len;k++){
                    if(arr[i]+arr[j]+arr[k] == sum){
                        System.out.println("Triplets found are :"+arr[i]+" "+arr[j]+" "+arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int len=sc.nextInt();
		
		int[] arr=new int[len];
		System.out.print("Enter "+len+" elements of the array : ");
		for(int i=0;i<len;i++){
		    arr[i]=sc.nextInt();
		}
		
		System.out.print("Sum you want from an Array : ");
		int sum=sc.nextInt();
		
		triplet Triplet=new triplet();
		Triplet.findTriplet(arr, len, sum);
	}
}
