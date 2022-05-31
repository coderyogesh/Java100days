package Week1.SelectionStatements;

import java.util.Scanner;
//Find the maximum number of blocks of dimension 2*1 that can be placed in a board of dimension entered by user.
public class FitSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        while(a>0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int count = Math.abs((m*n/2));
            System.out.println(count);
            a--;
        }
    }
}
