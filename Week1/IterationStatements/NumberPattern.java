package Week1.IterationStatements;

import java.util.Scanner;
// Program to print pattern on number
//12345
//1234
//123
//12
//1
public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
    }
}
