// Write a program to print a number after turn off of its kth bit.
import java.util.Scanner;

public class Turnoff {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter kth bit : ");
        int kthbit = sc.nextInt();
        num  = num & ~(1<<kthbit);
        System.out.println("After turn off the kth bit the number become: " +num);
    }
}
