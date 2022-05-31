package Week1.IterationStatements;

import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0) {
            int a =sc.nextInt();
            while(a>=10)
                a/=10;
            System.out.println(a);
            n--;
        }
    }
}
