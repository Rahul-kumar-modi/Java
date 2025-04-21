// Write a program to xor the given range from 1 to n .

import java.util.Scanner;

public class XorForGivenRange {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first range no.");
        int num1 =sc.nextInt();
        System.out.print("Enter the second range no.");
        int num2 =sc.nextInt();

        int num3 = xor(num1 - 1) ^ xor(num2);
        System.out.println("Xor for giver range " +num1+ " to " +num2+ " is: " +num3);
    }

    public static int xor(int n){
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n+1;
        if(n % 4 == 0) return n;
        return 0;  // if n % 4 == 3
    }
}
