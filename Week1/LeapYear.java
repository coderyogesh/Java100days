package Week1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0 )){
            System.out.println(a +" is a Leap Year");
        }
        else System.out.println(a+" is not a Leap Year");
    }
}
