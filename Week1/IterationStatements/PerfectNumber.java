package Week1.IterationStatements;

import java.util.Scanner;
//Program to Print If a Number is a perfect number or not (True/False).
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0 ) {
            int a=sc.nextInt();
            int s=0;
            for(int i=1;i<a;i++)
            {
                if(a%i==0)
                    s+=i;
            }
            if (s == a) {
                System.out.println("True");
            } else {
                System.out.println("false\n");
            }
            n--;
        }
    }
}
