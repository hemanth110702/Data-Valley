import java.io.*;
public class swap2nums {
    public static void main(String[] args) {
        int a = 200;
        int b = 300;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nAfter swapping operations without using third variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
