package Week1;

import java.util.Scanner;
//Check if a number is divisible by 10 and multiply the number by 2 to make it divisible by 10 , if not possible return -1.
public class TenFromTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem,value;
        rem = n%10;

        switch (rem) {
            case 0:
                value=0;
                break;
            case 5:
                value = 1;
                break;

            default:
                value=-1;
        }
        System.out.println(value);
    }
}
