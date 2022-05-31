package Week1.JavaFundamentalsCode;

import java.util.Scanner;

public class FavouriteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a =sc.nextInt();
         while (a--> 0)
         {
             int n = sc.nextInt();
             int rem, count = 0;
             while (n != 0)
             {
                 rem = n % 10;
                 n = n / 10;
                 if (rem == 5)
                     count++;
             }
             System.out.println(count);
         }
    }
}
