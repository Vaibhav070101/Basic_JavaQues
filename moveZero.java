public class moveZero {
    public static int[] movingZerosAtLast(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0) arr[count++]=arr[i];
        }
        while(count<arr.length){
            arr[count++]=0;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={1,25,0,8,6,20,5,0,0,5,0};
        int[] res;
        res=movingZerosAtLast(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
