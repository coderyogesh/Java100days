package Week1.IterationStatements;

import java.util.Scanner;
//Program to Print One Pattern.
// To print 111111111111111
public class PrintOnePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int  i =1; i<=15; i++)
            System.out.print(a);
    }
}
