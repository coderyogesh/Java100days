package Week1;

import java.util.Scanner;

//Day 2 of Code
// Concepts of Input Output
//Q. Given two integers represented by 'a' and 'b' ,perform a+b, a-b,a*b;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
    }
}
