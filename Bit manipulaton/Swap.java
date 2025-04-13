//Swapping two numbers

public class Swap {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("Original value of a is: " +a+ " and b is: " +b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Reverse value of a is: " +a+ " and b is: " +b);
    
    }
}
