//Finding single occurance number in a given array.

public class Singelno {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,1,5,3};
        int ans=0;
        for(int ele : arr){
            ans ^=ele;
        }

        System.out.println("The number which has occurance only one time is: " +ans);
    }
}
