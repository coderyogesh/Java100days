package Week1;

import java.util.Scanner;
//Finding relation between two integers.(a and b).
public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println(a+" is Greater than "+b);
        }
        else if (a<b){
            System.out.println(a+" is smaller than "+b);
        }
        else {
            System.out.println(a+"is equal to"+b);
        }
    }
}
