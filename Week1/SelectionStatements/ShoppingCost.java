package Week1.SelectionStatements;

import java.util.Scanner;
//Tina is preparing a shopping list containing NN items.
// She knows the quantity and price of each item on the list.
// The shop is offering a 20%20% discount on the items with a quantity of more than 100100 units.
// Given the quantity and price of each of the NN items, your task is to calculate how much each item will cost.
public class ShoppingCost {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        while(n>0) {
            float q,p,r,m;
            q=sc.nextInt();
            p=sc.nextInt();
            if(q>100)
            {r= (float) (p*0.2*q);
                m=p*q-r;
                System.out.println(m); }
            else
            { r=p*q;
                System.out.println(r);
            } n--;
        }

        }
    }

