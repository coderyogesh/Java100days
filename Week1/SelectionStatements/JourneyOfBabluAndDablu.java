package Week1.SelectionStatements;

import java.util.Scanner;
//Bablu and Dablu are traveling at train. This time they are traveling without their parents.
// Bablu wants to know the arrangement of seats inside the train coach. The entire coach could be viewed as an arrangement of consecutive
// blocks of size 88.Each of these size-88 blocks are further arranged as: 1LB,2MB,3UB,4LB,5MB,6UB,7SL,8SU,9LB,10MB,......1LB,2MB,3UB,4LB,5MB,6UB,7SL,8SU,9LB,10MB
//and the pattern is repeated for every set of 88 berths. Bablu and Dablu are playing a game of finding the train partner of each berth. But they are not able to find the right partner,
 //       they ask for help.
public class JourneyOfBabluAndDablu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        int t = sc.nextInt();
        while(t>0) {
            int n,x=0;
            n =sc.nextInt();
            x = n%8;
            if (x==0)
                System.out.println(n-1+"SL");
            else if (x==1)
                System.out.println(n+3+"LB");
            else if(x==2)
                System.out.println(n+3+"MB");
            else if(x==3)
                System.out.println(n+3+"UB");
            else if(x==4)
                System.out.println(n-3+"LB");
            else if(x==5)
                System.out.println(n-3+"MB");
            else if(x==6)
                System.out.println(n-3+"UB");
            else if(x==7)
                System.out.println(n+1+"SU");

            System.out.println();
            t--;
        }
    }
    }
}
