package Week1;

import java.util.Scanner;

public class PrintDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        System.out.println(String.format("%.2f",d));
    }
}
