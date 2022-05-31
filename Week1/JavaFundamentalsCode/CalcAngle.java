package Week1.JavaFundamentalsCode;

import java.util.Scanner;

public class CalcAngle {
public static float calcAngle() {

        Scanner sc = new Scanner(System.in);
        int h= sc.nextInt();
        int m = sc.nextInt();
        if (h < 0 || m < 0 || h > 12 || m > 60)
            System.out.println("Wrong Input");
        if (h == 12)
            h = 0;
        if (m == 60) {
            m = 0;
            h += 1;
            if (h > 12)
                h -= 12;
        }

        int h_angle = (int) (0.5 * (h * 60 + m));
        int m_angle = 6 * m;

        float angle = Math.abs(h_angle - m_angle);

        angle = Math.min(360 - angle, angle);
        return angle;
    }
    public static void main(String[] args) {
        System.out.println(calcAngle());
    }
}
