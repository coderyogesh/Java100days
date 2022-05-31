package Week1.IterationStatements;

import java.util.Scanner;
//Program to print Sum of All the Digits of the Given Number.
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int sum =0;

        while(a != 0) {
            sum+=a%10;
            a/=10;
        }
        System.out.println(sum);
    }
}
