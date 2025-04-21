// Write a program xor the number present in an array with using queries.

public class XorQueries {
    public static void main(String[] args) {
        int[] arr = {1, 3,4,8};
        int[][] queries = {{0,1}, {0,2}, {0,3}, {3,3}};
        int n=arr.length , m=queries.length;
        for(int i=1;i<m;i++){
            arr[i] ^=arr[i-1];
        }
        int[] ans = new int[m];
        for(int i=0;i<m;i++){
            int left = queries[i][0], right= queries[i][1];
            if(left==0) ans[i] = arr[right];
            else ans[i] = arr[left-1] ^ arr[left];
        }

        System.out.print("The xor queries of a subarray arr are: " + ans);
        
    }
}
