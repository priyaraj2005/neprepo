package scanner.java;
import java.util.Scanner;
public class sumoftwonuminput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first num :-");
        int x = sc.nextInt();
        System.out.println("enter the second num :-");
        int y = sc.nextInt();
        System.out.println("the sum of two number :-");
        int sum = x + y;
        System.out.println(sum);
    }
}
