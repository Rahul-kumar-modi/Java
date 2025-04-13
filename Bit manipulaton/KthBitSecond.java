//2nd method for checking if kth bit is set or not

import java.util.Scanner;

public class KthBitSecond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter kth bit : ");
        int kthbit = sc.nextInt();
        if ((num>>kthbit)%2 !=1)
            System.out.println("At " + kthbit + "th bit of " + num + " number is not set");
        else
            System.out.println("At " + kthbit + "th bit of " + num + " number is set");
    }
}
