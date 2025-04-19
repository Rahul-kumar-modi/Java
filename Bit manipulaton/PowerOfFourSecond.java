//2nd way to show whether the number is power of 4 or not.

import java.util.Scanner;

public class PowerOfFourSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Wrong number");
        } else {
            if (((num & (num - 1)) == 0) && (num % 3 == 1)) {
                System.out.println("Number " + num + " is power of 4");
            } else
                System.out.println("Number " + num + " is not power of 4");
        }
    }
}
