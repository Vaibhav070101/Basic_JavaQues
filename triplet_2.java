import java.util.*;
class Main{
    
    static boolean findTriplet(int[] arr, int len, int sum){
        for(int i=0;i<len;i++){
            HashSet<Integer> s=new HashSet<Integer>();
            int curr_sum=sum-arr[i];
            for(int j=i+1;j<len;j++){
                if(s.contains(curr_sum - arr[j])){
                    System.out.print("Triplets found are :"+arr[i]+" "+arr[j]+" "+(curr_sum-arr[j]));
                    return true;
                }
                s.add(arr[j]);
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
		
		Main Triplet=new Main();
		Triplet.findTriplet(arr, len, sum);
	}
}