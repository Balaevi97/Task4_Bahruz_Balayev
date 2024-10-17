import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character (letter)");
        String costumerChar = scanner.next();

        switch (costumerChar) {
            case "a":
            case "A":
            case "ა":
                System.out.println("Your character " + costumerChar + " is vowel");
                break;

            case "e":
            case "E":
            case "ე":
                System.out.println("Your character " + costumerChar + " is vowel!");
                break;

            case "i":
            case "I":
            case "ი":
                System.out.println("Your character " + costumerChar + " is vowel!");
                break;

            case "o":
            case "O":
            case "ო":
                System.out.println("Your character " + costumerChar + " is vowel!");
                break;

            case "u":
            case "U":
            case "უ":
                System.out.println("Your character " + costumerChar + " is vowel!");
                break;

            default:
                System.out.println("Your character " + costumerChar + " is consonant!");
                break;


        }
    }
}
