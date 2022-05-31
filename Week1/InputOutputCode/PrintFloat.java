package Week1.InputOutputCode;

import java.util.Scanner;

public class PrintFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println(String.format("%.22f",a)+" "+String.format("%.22f",b));
    }
}
