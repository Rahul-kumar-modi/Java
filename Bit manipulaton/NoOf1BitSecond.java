import java.util.Scanner;

public class NoOf1BitSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num &= (num - 1);
            count++ ;
        }
        System.out.println("The total number of 1 bits in number " + num + " is: " + count);
    }
}
