package scanner.java;
import java.util.Scanner;
public class scannerclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius :-");
        int radius;
        radius =sc.nextInt();
        double pi = 3.1415;
        double area = pi*radius*radius;
        System.out.println("the area of circle is:"+area);}
}
