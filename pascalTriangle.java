import java.util.*;
public class pascalTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows of Pascal's Triangle : ");
        int num=sc.nextInt();

        pascalTriangle tri=new pascalTriangle();
        tri.generate(num);
    }

    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> row,prev=null;

        for(int i=0;i<numRows;i++){
            row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev=row;
            res.add(row);
        }
        return res;
    }
}
