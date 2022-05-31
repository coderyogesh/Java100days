package Week1.IterationStatements;

import java.util.Scanner;
//Program in Java to Reverse A number.
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int reverse = 0;

        while(a != 0) {
           int  remainder = a % 10;
            reverse = reverse*10+remainder;
            a /= 10 ;
        }
        System.out.println(reverse);
    }
}
