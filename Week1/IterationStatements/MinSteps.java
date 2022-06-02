package Week1.IterationStatements;

import java.util.Scanner;

public class MinSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0) {
                int ans = 0, d = 2;
                int a =sc.nextInt();
                while ( a > 1) {
                    while (a % d == 0) {
                        ans += d;
                        a /= d;
                    }
                    d++;
                }
            n--;
            System.out.println(ans);
        }

    }
}