package Week1;

import java.util.Scanner;

public class BoxesAndToys {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,i,m=0;
        n = sc.nextInt();
        while(n>0) {
            int t,c,k;
            t = sc.nextInt();
            c = sc.nextInt();
            k= c-t;
            if (k>=2)
                m++;
            n--;
        }
        System.out.println(m);
    }

}
