//Minimum number of 1 bits required to convert a number to other number.

import java.util.Scanner;

public class MinBitFlip {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int start = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int goal = sc.nextInt();
        int n = start ^ goal;
        int count=0;
       for(int i=0;i<=31;i++){
          if((n & (1<<i))!=0) count++;
       }
        System.out.println("The total number of minimum 1 bit required to convert " +start+ " number to "  +goal+ " number is: " +count);
    }
}

