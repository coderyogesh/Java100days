package Week1;

import java.util.Scanner;

public class ModulusNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int mod = a%10;
        System.out.println(mod);
    }
}
