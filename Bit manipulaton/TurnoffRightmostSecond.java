
import java.util.Scanner;

public class TurnoffRightmostSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        num &= (num-1);
        System.out.println("After turn off the rightmost bit the number become: " + num);
    }
}
