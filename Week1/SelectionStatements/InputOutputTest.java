package Week1.SelectionStatements;

import java.util.Scanner;

//Day 2 of Code
// Concepts of Input Output
//Q. Given two integers represented by 'a' and 'b' ,perform a+b, a-b, a*b with Testcases variable;
public class InputOutputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t!= 0)
        {
            int a;
            int b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println((a + b)+" "+(a-b)+ " " + (a*b));
            t--;
        }

         }
}