package Week1.JavaFundamentalsCode;
//Write a program to take a number as input from the user and print the remainder when the no is divided by 10.

import java.util.Scanner;

public class PrintRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rem = a %10;
        System.out.println(rem);
    }
}
