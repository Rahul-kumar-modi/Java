//Check if kth bit is set or not

import java.util.Scanner;

public class KthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter kth bit : ");
        int kthbit = sc.nextInt();
        if((num & (1<<kthbit))==0) System.out.println("At " +kthbit+ "th bit of " +num+ " number is not set");
        else System.out.println("At " +kthbit+ "th bit of " +num+ " number is set");
    }
}
