# Write a program to print the number in reverse with number taken from user.

import java.util.Scanner;

public class ReverseBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n =sc.nextInt();
        int i=0, j=31;
        while(i<j){
            int iMask = (1<<i), jMask = (1<<j);
            boolean iOn = ((n & iMask)!=0), jOn = ((n & jMask)!=0);

            if(iOn != jOn){
                n ^= iMask;
                n ^=jMask;
            }
            i++;
            j--;
        }
     System.out.println("Number after reversed is: " +n);
    }
}
