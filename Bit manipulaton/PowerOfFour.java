//To show whether the number is power of 4 or not.

import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Wrong number");
        } else {
            if (((num & (num - 1)) == 0) && isPerfectSquare(num)) {
                System.out.println("Number " + num + " is power of 4");
            } else
                System.out.println("Number " + num + " is not power of 4");
        }
    }

    public static boolean isPerfectSquare(int n){
        int root = (int) Math.sqrt(n);
        return (root * root ==n);
    }
}
