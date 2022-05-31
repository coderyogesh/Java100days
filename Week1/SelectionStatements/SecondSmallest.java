package Week1.SelectionStatements;

import java.util.Scanner;

import static java.lang.Math.min;

//Way 1 using combining all the integers and subtracting min and max from them.
public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
//        int max = Math.max(a,Math.max(b,c));
//        int min = min(a, min(b,c));
//
//        int sec = a+b+c - min-max;
//        System.out.println(sec);

        // Way 2 using if else
        if (a>b && a<c || a>c && a<b ){
            System.out.println(a);
        }
        else if (b>c && b<a || b<c && b>a){
            System.out.println(b);
        }
        else System.out.println(c);
    }
}
