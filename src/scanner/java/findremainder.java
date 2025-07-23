package scanner.java;

import java.util.Scanner;

public class findremainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend:");
        int a = sc.nextInt();

        System.out.println("Enter the divisor:");
        int b = sc.nextInt();

        int q = a / b;
        int r = a - (b * q);

        System.out.println("The remainder when " + a + " is divided by " + b + " is " + r);

        sc.close(); // good practice
    }
}
