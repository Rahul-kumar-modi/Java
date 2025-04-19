import java.util.Scanner;

public class TurnoffRightmost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int a = num;
        int k = 0;
        while (a % 2 == 0) {
            a >>= 1;
            k++;
        }

        num &= ~(1 << k);
        System.out.println("After turn off the rightmost bit the number become: " + num);
    }
}
