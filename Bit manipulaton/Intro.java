//Introduction about bitwise operators

import java.util.Scanner;

public class Intro{
    public static void main(String[] args) {
        System.out.println(4|8); //Bitwise OR
        System.out.println(4&8); //Bitwise AND
        System.out.println(4^8); //Bitwise XOR
        System.out.println(40>>2); //Right shift
        System.out.println(40<<2); //Left shift
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int num = sc.nextInt();
        System.out.println("1's compliment of " + num + " is :" + ~num);
        System.out.println("2's compliment of " + num + " is :" + ~num + 1);

    }
}