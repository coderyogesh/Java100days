package Week1;

import java.util.Scanner;

public class MixedInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        float b = sc.nextFloat();
        String c = sc.nextLine();

        System.out.println(a+"$"+String.format("%.2f", b)+"$"+c);

    }
}
