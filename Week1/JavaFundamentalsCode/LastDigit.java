package Week1.JavaFundamentalsCode;

import java.util.Scanner;

//Take an Integer as Input from the user and print last digit of the number.
public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int lastDigit = a % 10;
        System.out.println(lastDigit);
    }
}
