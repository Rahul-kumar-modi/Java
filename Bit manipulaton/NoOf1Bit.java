import java.util.Scanner;

public class NoOf1Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int count=0;
       for(int i=0;i<=31;i++){
          if((num & (1<<i))!=0) count++;
       }
        System.out.println("The total number of 1 bits in number " + num + " is: " +count);
    }
}
