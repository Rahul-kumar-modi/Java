import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        int[] nums= {1,2,3};
        ArrayList<ArrayList<Integer>>  ans = new ArrayList<>();
        int n = nums.length;
        int total = (1<<n);
        for(int num=0;num<total;num++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int bitIdx=0; bitIdx<n; bitIdx++){
                int mask = (1<<bitIdx);
                if((num & mask)!=0) list.add(nums[bitIdx]);
            }
            ans.add(list);
        }

        System.out.print("Subsets of a nums array is: " +ans);
        
    }
}
