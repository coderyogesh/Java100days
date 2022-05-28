package Week1;

import java.util.Scanner;
//Print corresponding value of a character.
public class CharacterValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        switch (ch) {
            case "A", "a" -> System.out.println("Apple");
            case "B", "b" -> System.out.println("Bee");
            case "C", "c" -> System.out.println("Cat");
            case "D", "d" -> System.out.println("Data Structure");
            case "E", "e" -> System.out.println("Expert Coder");
            case "F", "f" -> System.out.println("Fish");
            case "G", "g" -> System.out.println("Goat");
            case "H", "h" -> System.out.println("hat");
            case "I", "i" -> System.out.println("Ice");
            case "J", "j" -> System.out.println("Jug");
            case "K", "k" -> System.out.println("Kite");
            case "L", "l" -> System.out.println("Lion");
            case "M", "m" -> System.out.println("Monster");
            case "N", "n" -> System.out.println("Nintendo");
            case "O", "o" -> System.out.println("Owl");
            case "P", "p" -> System.out.println("Power");
            case "Q", "q" -> System.out.println("Queen");
            case "R", "r" -> System.out.println("Rich");
            case "S", "s" -> System.out.println("Saloon");
            case "T", "t" -> System.out.println("Television");
            case "U", "u" -> System.out.println("Utah");
            case "V", "v" -> System.out.println("Venom");
            case "W", "w" -> System.out.println("Wizard");
            case "X", "x" -> System.out.println("x-men");
            case "Y", "y" -> System.out.println("Yogesh");
            case "Z", "z" -> System.out.println("Zebra");
            default -> System.out.println("Please input any character");
        }
}
}
