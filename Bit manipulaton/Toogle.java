//Toggle the kth bit

import java.util.Scanner;

public class Toogle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter kth bit : ");
        int kthbit = sc.nextInt();
        num  = num ^ (1<<kthbit);
        System.out.println("After toogle off the kth bit the number become: " +num);
    }
}
